package check;

import check.Pet;
import constants.Constants;

public class Main {
		
/*  課題① 【Main.java】にてフィールド変数firstNameとlastNameを宣言し、
 *  firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
 *  なお、変数のアクセス修飾子は「private」とする。
 */
	
    private String firstName = "岩崎";
    private String lastName = "優";
    
 /*  【Main.java】にてfirstNameとlastNameを引数で受け取って、
  *  連結して表示させるメソッド「printName」を作成しなさい。
  *  作成した関数のアクセス修飾子は「private」とする。
  */
    private void printName(String firstName, String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	System.out.println(this.firstName + this.lastName);

    }
		
    public static void main(String[] args) {
    	Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
    	RobotPet rt = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
    	
    	pt.introduce();
    	rt.introduce();
    	
    }
}

