/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data ={3,1,2,7,5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */

        //for文：ループカウンタの初期化;継続条件;ループカウンタ更新

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }

        //改行する
        System.out.println();

        //iは0から1つずつ増やしてi<4の間、繰り返し処理する。
        for (int i = 0; i < data.length -1; i++) {

            //ｊは4から1つずつ減らしてj>iの間、繰り返し処理する。
            for (int j = data.length-1; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */

                /*"j-1>j"の場合、変数boxにjの値を代入する。
                *  jに"j-1”の値を代入し、j-1にboxの値を代入する。
                */
                if(data[j-1] > data[j]){
                  int box = data[j];
                  data[j] = data[j-1];
                  data[j-1] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}