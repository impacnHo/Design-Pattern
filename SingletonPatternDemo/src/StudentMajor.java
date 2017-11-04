public class StudentMajor {

	private static String[] majorList = { "电气工程", "自动化", "通信工程", "软件工程",
			"网络工程", "数字媒体技术", "交通工程", "车辆工程", "工业工程", "安全工程", "环境工程", "飞行技术",
			"飞行器制造", "应用统计学", "土木工程", "市场营销", "物流管理", "会计学", "审计学", "日语",
			"西班牙语", "法学", "产品设计", "工艺美术" };

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
