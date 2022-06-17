import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDateClass {
	public static void main(String[] args) {
	    try {
	      String str = "2020/01/01 12:00:00";

	      SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	      Date date = format.parse(str);
	      System.out.println(date);

	    } catch (ParseException e) {
	      e.printStackTrace();
	    }
	  }
}
