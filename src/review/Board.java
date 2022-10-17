package review;

public class Board {

	private String title;
	private String writer;
	private String content;
	private String password;
	private int writeNum;
	
	
	public int getWriteNum() {
		return writeNum;
	}
	public void setWriteNum(int writeNum) {
		this.writeNum = writeNum;
	}
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
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.password = password;
	}
	
	
	public Board(String title, String writer, String content, int writeNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeNum = writeNum;
	}
	public void prt() {
		System.out.println("---------------------------------");
		System.out.println("제목 : "+this.title);
		System.out.println("작성자 : "+this.writer);
		System.out.println("내용 : "+this.content);
		System.out.println("---------------------------------");
		
	}
	
	
	
}
