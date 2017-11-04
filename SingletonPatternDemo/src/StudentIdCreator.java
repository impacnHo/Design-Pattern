public class StudentIdCreator {
	private String year;// ���
	private String faculty;// ѧԺ
	private String major;// רҵ
	private String classNum;// �༶��
	private String id;// ��ˮ��
	private String completeId;// ������ѧ��
	private static StudentIdCreator instance = new StudentIdCreator();// StudentIdCreator��һ������

	// ˽�еĹ��췽��
	private StudentIdCreator() {}

	private StudentIdCreator(String faculty, String major, int classNum) {
		String classNumStr = "";
		this.year = StudentYear.getYear();
		this.faculty = StudentFaculty.getFaculty(faculty);
		this.major = StudentMajor.getMajor(major);
		classNumStr = "0" + String.valueOf(classNum);// �������ַ�����ת��
		this.classNum = classNumStr;
		this.id = StudentId.getStudentId();
		this.completeId = this.year + this.faculty + this.major + this.classNum
				+ this.id;
	}

	// ��ȡΨһ���ö���
	public static StudentIdCreator getInstance(String faculty, String major,
			int classNum) {
		instance = new StudentIdCreator(faculty, major, classNum);
		return instance;
	}

	// ��ʾ������ѧ��
	public void showCompleteId() {
		System.out.println(completeId);
	}
}
