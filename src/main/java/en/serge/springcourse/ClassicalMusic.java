package en.serge.springcourse;

public class ClassicalMusic implements Music {
	
	String author;
	int id;

	@Override
	public String getSong() {
		return "Four seasons";
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Classical song: " +  this.getSong() + ". Classical author: " + author + ". Classical id: " + id;
		
	}

}
