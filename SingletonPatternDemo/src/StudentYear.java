import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentYear {
	public static String getYear() {
		//��ȡ2λ���
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		return sdf.format(date);
	}
}
