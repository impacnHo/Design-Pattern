/*
 * ��ť-������
 */
public class Button {

	// ��������
	Command command;
	
	// ��������
	public void setCommand(Command command){
		this.command = command;
	}

	// ִ�з���
	public void doCommand() {
		command.excute();
	}

}
