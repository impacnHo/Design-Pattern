public class OutLibraryState implements State {
	
	Book book;
	
	public OutLibraryState(Book book){
		this.book = book;
	}

	@Override
	public void borrowBook() {
		System.out.println("����ʧ��");
	}

	@Override
	public void returnBook() {
		System.out.println("����ɹ�");
		book.setState(book.getInLibraryState());
	}

}
