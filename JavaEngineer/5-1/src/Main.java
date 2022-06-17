import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Date;

public class Main {

	private static Date now;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
			//      問① 下記の配列はString型しか格納できないように修正してください。
			//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
			List<Object> array = new ArrayList<>();
			//	    <以下記述>

			//      問② 前から二つ目の要素を"bar"にしましょう。
			//	　<以下記述>
			array.add  ("1");
			array.add  ("2");
			array.add  ("3");
			array.set(1,"foo"); 
			//      問③ fooが格納されているインデックスを出力してください。
			//	　<以下記述>
			int Index = array.indexOf("foo");
			System.out.println("fooのインデックス"+Index);
		}

		{
			// 問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
			Map<String, Object> map = new HashMap<>();
			map .put("adress","/////");
			map .put("name","Kosuke");
			map .put("age","29");

			//		問⑤上記で格納したキーを繰り返し文で出力しましょう。
			for (Entry<String, Object> key : map.entrySet()){
				System.out.println("key: " + key.getKey());

				//  問⑥上記で格納したバリューを繰り返し文で出力しましょう。
				//	<以下記述>
			}
			for (Entry<String, Object> entry : map.entrySet()) {
				System.out.println( "value: " + entry.getValue());
			}
			{
				// 問⑦ 配列arrayDateに今の年・月・日を入れてください。
				Calendar cal = Calendar.getInstance();
				int[] arrayDate = new int [3];
			    arrayDate[0]=cal.get(Calendar.YEAR);
			    arrayDate[1]=cal.get(Calendar.MONTH)+1;
			    arrayDate[2]=cal.get(Calendar.DATE);
			    
				// 問⑧ 配列arrayDateをList型に変更しましょう。
			    List<Integer> list =new ArrayList<>();
			    list.add(arrayDate[0]);
			    list.add(arrayDate[1]);
			    list.add(arrayDate[2]);
			    
//				cal.get(Calendar.YEAR);
//				cal.get((Calendar.MONTH) + 1);
//				cal.get(Calendar.DATE);
				
				// 問⑨ 上記で格納した要素を繰り返しで出力しましょう。拡張for文
				//	    <以下記述>
			    for(int loop : list ) {
			    System.out.println(loop);	
			    }
			}
		}
	}
}

