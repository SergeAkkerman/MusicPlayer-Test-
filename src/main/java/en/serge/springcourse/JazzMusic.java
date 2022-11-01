package en.serge.springcourse;

public class JazzMusic implements Music {
	
	String author;
	int id;

	@Override
	public String getSong() {
		return "What a wonderful world";
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Jazz song: " +  this.getSong() + ". Jazz author: " + author + ". Jazz id: " + id;
		
	}

}
