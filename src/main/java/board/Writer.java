package board;

public class Writer {
	private String title;
	private String contents;
	private String writer;
	public Writer(String title, String contents, String writer) {
		this.title=title;
		this.contents=contents;
		this.writer=writer;
	}
	public Writer(String title, String writer) {
		this.title=title;
		this.writer=writer;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	
	public String getWriter() {
		return writer;
	}
	
	
	

}
