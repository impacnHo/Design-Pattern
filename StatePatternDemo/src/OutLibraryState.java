public class OutLibraryState implements State {
	
	Book book;
	
	public OutLibraryState(Book book){
		this.book = book;
	}

	@Override
	public void borrowBook() {
		System.out.println("借书失败");
	}

	@Override
	public void returnBook() {
		System.out.println("还书成功");
		book.setState(book.getInLibraryState());
	}

}
