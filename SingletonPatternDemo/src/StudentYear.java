import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentYear {
	public static String getYear() {
		//获取2位年份
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		return sdf.format(date);
	}
}
