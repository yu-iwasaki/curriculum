package service;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
import bean.EmployeeBean;
 
/**
 * ・社員情報検索サービス
 */
 
public class EmployeeService {
 
  // 問① 接続情報を記述してください
 /** ドライバーのクラス名 */
 private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
 /** ・JDBC接続先情報 */
 private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/Employee";
 /** ・ユーザー名 */
 private static final String USER = "postgres";
 /** ・パスワード */
 private static final String PASS = "bknbjw06";
 /** ・タイムフォーマット */
 private static final String TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";
 
  // 問② 入力された値で、UPDATEする文
 /** ・SQL UPDATE文 */
 private static final String SQL_UPDATE = "UPDATE employee_table SET login_time = ? where id = ?";
 
  // 問③ 入力されたIDとPassWordをキーにして、検索するSELECT文
 /** ・SQL SELECT文 */
 private static final String SQL_SELECT = "select * from employee_table where id = '?' AND password = '?'";
 
 EmployeeBean employeeDate = null;
 
 
  // 送信されたIDとPassWordを元に社員情報を検索するためのメソッド
 public EmployeeBean search(String id, String password) {
 
// 　最初に変数connectionを初期化している
 Connection connection = null;
//　　最初に変数statementを初期化している
 Statement statement = null;
//　　最初に変数resultSetを初期化している
 ResultSet resultSet = null;
//最初に変数preparedStatementを初期化している
 PreparedStatement preparedStatement = null;
 
 try {
  // データベースに接続
 Class.forName(POSTGRES_DRIVER);
// ドライブマネージャークラスのgetConnection(URL,ユーザー名,パス,)を指定し、取得し参照をconnectionに代入する。
 connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
// SQL文データベースに送るためのStatementオブジェクト生成する。
 statement = connection.createStatement();
 
 //　　オブジェクトを生成し、デフォルトの値としてこのメソッドが実行された時の日時の情報を取得している。 
 // 　処理が流れた時間をフォーマットに合わせて生成
 Calendar cal = Calendar.getInstance();
 SimpleDateFormat sdFormat = new SimpleDateFormat(TIME_FORMAT);
 
  // PreparedStatementで使用するため、String型に変換。
 // オブジェクトが持つ日付と時刻の値を基準日時からの経過ミリ秒の値として返します。
 String login_time = sdFormat.format(cal.getTime());
 
 /*
 * 任意のユーザーのログインタイムを更新できるように、プリペアドステートメントを記述。
 */
 
  // preparedStatementに実行したいSQLを格納
 preparedStatement = connection.prepareStatement(SQL_UPDATE);
  // 問④ preparedStatementを使って、一番目のindexに今の時間をセットしてください。2番目のindexにIDをセットしてください。
 
// パラメータへ値の設定
//　※補足情報：パラメータはSQL文中に記述された「?」を先頭から順番に1，2，3、･･･と順番に番号が割り当てられている
// preparedStatement.setString(パラメータ番号, パラメータに設定したい値);
 preparedStatement.setString(1, login_time);
 preparedStatement.setString(2, id);
 
  // 問⑤ UPDATEを実行する文を記述
  // 前処理済みのSQL文（検索系SQL以外のSQL文）を実行し，更新行数を返却します。
 preparedStatement.executeUpdate();
 
 /*
 * UPDATEが成功したものを即座に表示
 * 任意のユーザーを検索できるように、プリペアドステートメントを記述。
 */
 
 preparedStatement = connection.prepareStatement(SQL_SELECT);
  //問⑥ 一番目のindexにIDをセットしてください。2番目のindexにPASSWORDをセット。
 preparedStatement.setString(1, id);
 preparedStatement.setString(2, password);
 
  // SQLを実行。実行した結果をresultSetに格納。
 resultSet = preparedStatement.executeQuery();
 
//　カーソルという、データの位置を指し示す概念があり、初期状態では最初の行の先頭を指し示している。
 
 /*　nextメソッドを実行するとResultSetオブジェクトに行が存在すれば
 　*　戻り値としてtrueが、それ以上行がない場合にfalseが返ってくる。
 　*　whileを使ってループを回すことで、ResultSetオブジェクト内のデータをすべて取得できる。
  */
 while (resultSet.next()) {
  // 問⑦ tmpName,tmpComment,tmpLoginTimeに適当な値を入れてください。
 String tmpName = resultSet.getString("name");
 String tmpComment = resultSet.getString("comment");
 String tmpLoginTime = resultSet.getString("login_time");
 
  // 問⑧ EmployeeBeanに取得したデータを入れてください。
 employeeDate = new EmployeeBean();
 employeeDate.setName(tmpName);
 employeeDate.setComment(tmpComment);
 employeeDate.setLogin_Time(tmpLoginTime);
 }
 
  // forName()で例外発生
 } catch (ClassNotFoundException e) {
 e.printStackTrace();
 
  // getConnection()、createStatement()、executeQuery()で例外発生
 } catch (SQLException e) {
 e.printStackTrace();
 
 } finally {
 try {
 
 if (resultSet != null) {
 resultSet.close();
 }
 if (statement != null) {
 statement.close();
 }
 if (connection != null) {
 connection.close();
 }
 
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 return employeeDate;
 }
}
