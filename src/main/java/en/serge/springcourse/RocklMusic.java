package en.serge.springcourse;

public class RocklMusic implements Music {
	
	String author;
	int id;

	@Override
	public String getSong() {
		return "ThunderStruck";
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
		return "Rock song: " +  this.getSong() + ". Rock author: " + author + ". Rock id: " + id;
		
	}

}
