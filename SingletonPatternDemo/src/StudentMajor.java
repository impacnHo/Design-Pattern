public class StudentMajor {

	private static String[] majorList = { "��������", "�Զ���", "ͨ�Ź���", "�������",
			"���繤��", "����ý�弼��", "��ͨ����", "��������", "��ҵ����", "��ȫ����", "��������", "���м���",
			"����������", "Ӧ��ͳ��ѧ", "��ľ����", "�г�Ӫ��", "��������", "���ѧ", "���ѧ", "����",
			"��������", "��ѧ", "��Ʒ���", "��������" };

	public static String getMajor(String majorName) {
		String MajorStr = "";
		for (int i = 0; i < majorList.length; i++) {
			if (majorName == majorList[i]) {
				if (i < 9) {
					MajorStr = "0" + String.valueOf(i + 1);
				} else {
					MajorStr = String.valueOf(i + 1);
				}
			}
		}
		return MajorStr;
	}
}
