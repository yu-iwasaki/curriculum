package interfaces;


/**
 * 2. 司令される側 七海クラス
 * <pre>インターフェースを複数実装する<pre>
 */
public class Nanaumi implements OrderFromMotoki, OrderFromShihandai {
 
  // ... もときさんの司令とか
 
 @Override
  // Javaカリキュラム作れ！: OrderFromShihandai
 public String doCreateJavaCurriculum() {
 return "Javaカリキュラム完成しました！";
 }

@Override
public void daseyaKinmuhyo() {
	// TODO 自動生成されたメソッド・スタブ
	
}

@Override
public void daseyaKotsuhi() {
	// TODO 自動生成されたメソッド・スタブ
	
}

@Override
public void goToSevenEleven() {
	// TODO 自動生成されたメソッド・スタブ
	
}
}