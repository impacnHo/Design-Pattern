public class StudentFaculty {
	
	private static String[] facultyList = { "��Ϣ", "�����", "��ҵ�Զ���", "�����뻷��", "����",
			"��������ľ����", "��", "��������", "�����", "���̷���", "���������" };

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
