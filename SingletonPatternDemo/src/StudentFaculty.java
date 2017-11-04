public class StudentFaculty {
	
	private static String[] facultyList = { "信息", "计算机", "工业自动化", "材料与环境", "航空",
			"数理与土木工程", "商", "会计与金融", "外国语", "民商法律", "设计与艺术" };

	public static String getFaculty(String facultyName) {
		String FacultyStr = "";
		for (int i = 0; i < facultyList.length; i++) {
			if (facultyName == facultyList[i]) {
				if (i < 9) {
					FacultyStr = "0" + String.valueOf(i + 1);
				} else {
					FacultyStr = String.valueOf(i + 1);
				}
			}
		}
		return FacultyStr;
	}
}
