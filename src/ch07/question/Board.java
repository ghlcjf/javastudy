package ch07.question;

public class Board {
	private String title;
	private String writer;
	private String content;
	private String password;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Board(String title, String writer, String content, String password) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.password = password;
	}
	public void prt() {
		System.out.println("제목 : "+title);
		System.out.println("작성자 : "+writer);
		System.out.println("내용 : "+content);
	}
	
}
