package study;

import java.util.ArrayList;

//ArrayListSampleクラスを生成する。
public class ArrayListSample {
	
//	mainメソッド
	public static void main(String[] args) {
		
		//ArrayListクラスのオブジェクトを作成する。
		ArrayList<String> list = new ArrayList<String>();
		
		//文字列を格納する。	
		list.add("java");
		list.add("ここまで");
		list.add("頑張りました");
		
        //iが０から１つずつ増やして、list.size（３つ)まで処理が繰り返される。
		for(int i = 0; i < list.size(); i++) {
			//listの出力する。
			System.out.println(list.get(i));
		}
	}

}
