package BookManage;

import java.util.Date;

public class Book implements java.io.Serializable{
    private String bookName;
    private String bookClass;
    private String writer;
    private Date time;
    private String content;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Book(String bookName, String bookClass, String writer, Date time, String content) {
        this.bookName = bookName;
        this.bookClass = bookClass;
        this.writer = writer;
        this.time = time;
        this.content = content;
    }

    public Book() {
        super();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookClass='" + bookClass + '\'' +
                ", writer='" + writer + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                '}';
    }
}
