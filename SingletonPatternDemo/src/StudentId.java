public class StudentId {

	public static String getStudentId() {
		int id = (int) (Math.random() * 99 + 1);
		String idStr = "";
		if (id <= 9) {
			idStr = "0" + String.valueOf(id);
		} else {
			idStr = String.valueOf(id);
		}
		return idStr;
	}
}
