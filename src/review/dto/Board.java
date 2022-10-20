package review.dto;

public class Board {

	private String title;
	private String writer;
	private String content;
	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void prt() {
		System.out.println("---------------------------------");
		System.out.println("제목 : "+this.title);
		System.out.println("작성자 : "+this.writer);
		System.out.println("내용 : "+this.content);
		System.out.println("---------------------------------");
	}
	public Board(String title, String writer, String content) {
<<<<<<< HEAD
		super();
=======
>>>>>>> 5d7ea735e46a7096ed97e64e9d753ba26dcd5ed8
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	
	
	
}
