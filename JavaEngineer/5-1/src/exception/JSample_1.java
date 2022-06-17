package exception;
import java.util.Scanner;

public class JSample_1 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("年齢を入力してください");
		String old = scanner.next();
		String pref = scanner.next();
		
		System.out.println("年齢は"+old+"です");
		System.out.println("出身地は"+ pref +"です。");
	}
}
