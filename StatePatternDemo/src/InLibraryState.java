public class InLibraryState implements State {
	
	Book book;
	
	public InLibraryState(Book book){
		this.book = book;
	}

	@Override
	public void borrowBook() {
		System.out.println("����ɹ�");
		book.setState(book.getOutLibraryState());
	}

	@Override
	public void returnBook() {
		System.out.println("��δ���飬����ִ�й黹");
	}

}
