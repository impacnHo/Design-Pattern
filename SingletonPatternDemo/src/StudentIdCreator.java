public class StudentIdCreator {
	private String year;// 年份
	private String faculty;// 学院
	private String major;// 专业
	private String classNum;// 班级号
	private String id;// 流水号
	private String completeId;// 完整的学号
	private static StudentIdCreator instance = new StudentIdCreator();// StudentIdCreator的一个对象

	// 私有的构造方法
	private StudentIdCreator() {}

	private StudentIdCreator(String faculty, String major, int classNum) {
		String classNumStr = "";
		this.year = StudentYear.getYear();
		this.faculty = StudentFaculty.getFaculty(faculty);
		this.major = StudentMajor.getMajor(major);
		classNumStr = "0" + String.valueOf(classNum);// 整形与字符串的转换
		this.classNum = classNumStr;
		this.id = StudentId.getStudentId();
		this.completeId = this.year + this.faculty + this.major + this.classNum
				+ this.id;
	}

	// 获取唯一可用对象
	public static StudentIdCreator getInstance(String faculty, String major,
			int classNum) {
		instance = new StudentIdCreator(faculty, major, classNum);
		return instance;
	}

	// 显示完整的学号
	public void showCompleteId() {
		System.out.println(completeId);
	}
}
