package bean;
/**
 * ・社員情報データ（モデル）
 */

//EmployeeBeanのクラス

public class EmployeeBean {
	
//	変数を定義する。
    private String Id;
    private String PassWord;
    private String Name;
    private String Comment;
    private String Login_Time;
    
//   setIdメソッドの定義を記述し、引数Idを渡して、戻り値をこのクラスのIdの変数に代入する
    public void setId(String Id) {
        this.Id = Id;
    }
//    Idメソッドは、Idを戻り値に返す。
    public String Id() {
        return Id;
    }
//	setPassWordメソッドはString型のPassWordを引数として渡し、戻り値をこのクラスのPassWordの変数に代入する
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
//    getPassWordメソッドは、PassWordを戻り値に返す。
    public String getPassWord() {
        return PassWord;
    }
//    setNameメソッドはString型のNameを引数として渡し、戻り値をこのクラスのNameの変数に代入する
    public void setName(String Name) {
        this.Name = Name;
    }
// 	getNameメソッドはNameを戻り値に返す。   
    public String getName() {
        return Name;
    }
//    setLogin_TimeメソッドはString型のLogin_Timeを引数として渡し、戻り値をこのクラスのLogin_Timeの変数に代入する
    public void setLogin_Time(String Login_Time) {
        this.Login_Time = Login_Time;
    }
// 	setLogin_TimeはLogin_Timeを戻り値に返す。  
    public String getLogin_Time() {
        return Login_Time;
    }
    
//  setCommentメソッドはString型のCommentを引数として渡し、戻り値をこのクラスのCommentの変数に代入する    
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

// 	getCommentはCommentを戻り値に返す。  
    public String getComment() {
        return Comment;
    }
}