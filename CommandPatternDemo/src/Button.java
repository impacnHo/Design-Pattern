/*
 * 按钮-请求者
 */
public class Button {

	// 命令属性
	Command command;
	
	// 设置命令
	public void setCommand(Command command){
		this.command = command;
	}

	// 执行方法
	public void doCommand() {
		command.excute();
	}

}
