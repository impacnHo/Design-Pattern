public class InLibraryState implements State {
	
	Book book;
	
	public InLibraryState(Book book){
		this.book = book;
	}

	@Override
	public void borrowBook() {
		System.out.println("借书成功");
		book.setState(book.getOutLibraryState());
	}

	@Override
	public void returnBook() {
		System.out.println("尚未借书，不能执行归还");
	}

}
