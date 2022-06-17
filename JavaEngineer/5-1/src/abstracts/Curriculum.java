package abstracts;
import java.util.Set;
import java.util.HashSet;

public class Curriculum {
	
	public static void main(String[]args) {
		Set<String>sample1 = new HashSet<String>();
		
		sample1.add("A");
		sample1.add("BA");
		sample1.add("ABC");
		sample1.add("ABCDE");
		sample1.add("CD");
		
		System.out.println("HashSetなのでランダムに表示される");
		
		for(String s1:sample1) {
			System.out.println(s1);
		}
	}

}
