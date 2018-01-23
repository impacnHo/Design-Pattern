public class Book {
	State inLibraryState;
	State outLibraryState;
	State state;

	public Book() {
		inLibraryState = new InLibraryState(this);
		outLibraryState = new OutLibraryState(this);
		state = inLibraryState;
	}
	
	// get
	public State getInLibraryState(){
		return inLibraryState;
	}
	
	public State getOutLibraryState(){
		return outLibraryState;
	}
	
	public State getState() {
		return state;
	}

	// Í¼Êé×´Ì¬
	public void setState(State state) {
		this.state = state;
	}
	
	//
	public void borrowBook() {
		state.borrowBook();
	}

	public void returnBook() {
		state.returnBook();
	}

}
