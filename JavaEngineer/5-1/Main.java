
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//	    <以下記述>
	       List<String> array = new ArrayList<>();
//      問② 前から二つ目の要素を"bar"にしましょう。
	       array[1] = "bar";
	      

//      問③ fooが格納されているインデックスを出力してください。
	       System.out.pritnln(foo[]);
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
	　		map .put("adress","/////");
	　		map .put("name","Kosuke");
	　		map .put("age",29);
		}

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
		for (int i = 0; i < map(); i++) {
            System.out.println(map.get(i));
        }
		
//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
		
		}
		{
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
//	    <以下記述>
//      問⑧ 配列arrayDateをList型に変更しましょう。
//	    <以下記述>
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
		}
	}

}