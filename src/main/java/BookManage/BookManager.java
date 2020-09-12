package BookManage;

import java.util.*;

public class BookManager implements java.io.Serializable{
    private String name;//管理员姓名
    private static Map<String, List<Book>> books;

    public BookManager(String name) {
        this.name = name;
        books=new HashMap<String, List<Book>>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBooks(Map<String, List<Book>> ku) {
        books = ku;
    }
    public Map<String, List<Book>> getBooks() {
        return books;
    }
    //查看所有分类
    public List<String> findAllClasses(){
        if(!books.isEmpty()){
            return new ArrayList<String>(books.keySet());
        }
        else{
            System.out.println("书库为空");
            return null;
        }
    }
    //查看指定分类所有书籍
    public List<Book> findClassBooks(String classname){
        List<Book> bookList=new ArrayList<Book>();
        if(!books.isEmpty()){
            boolean classExist=false;
            for(String type: books.keySet()){
                if(type.equals(classname)){
                    classExist=true;
                    bookList=books.get(classname);
                }
            }
            if(!classExist){
                System.out.println("指定分类不存在");
                return null;
            }
            else{
                return bookList;
            }
        }
        else{
            System.out.println("书库为空");
            return null;
        }
    }
    //添加书籍分类
    public Boolean addBookClass(String classname){
        boolean classExist=false;
        for(String type:books.keySet()){
            if(type.equals(classname)){
                classExist=true;
                break;
            }
        }
        if(!classExist){
            List<Book> newList=new ArrayList<Book>();
            books.put(classname,newList);
            return true;
        }
        else{
            System.out.println("分类已存在");
            return false;
        }
    }
    //删除书籍分类
    public Boolean delBookClass(String classname){
        boolean classExist=false;
        for(String type:books.keySet()){
            if(type.equals(classname)){
                classExist=true;
                break;
            }
        }
        if(!classExist){
            System.out.println("书籍分类不存在");
            return false;
        }
        else{
            List<Book> bookList =new ArrayList<Book>();
            bookList=books.get(classname);
            if(!bookList.isEmpty()){
                System.out.println("该分类下还有书籍,无法删除");
                return false;
            }
            else{
                Iterator<String> iter = books.keySet().iterator();
                while(iter.hasNext()){
                    if(iter.next().equals(classname)){
                        iter.remove();
                    }
                }
                return true;
            }
        }
    }
    //查找书籍
    public Book findBook(String bookName){
        Book book=new Book();
        boolean bookFind=false;
        if(!books.isEmpty()){
            for(String type: books.keySet()){
                List<Book> bookList=new ArrayList<Book>();
                bookList=books.get(type);
                for(Book book1:bookList){
                    if(book1.getBookName().equals(bookName)){
                        book=book1;
                        bookFind=true;
                    }
                }
            }
            if(!bookFind){
                System.out.println("书籍不存在");
                return null;
            }
            else{
                return book;
            }
        }
        else{
            System.out.println("书库为空");
            return null;
        }
    }
    //添加书籍
    public Boolean addBook(Book book){
        //1.确认书名没有重复
        boolean nameOk=true;
        boolean classExist=false;
        for(String type: books.keySet()){
            List<Book> bookList=books.get(type);
            for(Book book1:bookList){
                if(book1.getBookName().equals(book.getBookName())){
                    nameOk=false;
                    break;
                }
            }
        }
        if(!nameOk){
            System.out.println("书名重复");
            return false;
        }
        //2.确认书的分类是否存在
        for(String type:books.keySet()){
            if(type.equals(book.getBookClass())){
                classExist=true;
                break;
            }
        }
        //3.不存在就创建
        if(!classExist){
            List<Book> newList=new ArrayList<Book>();
            books.put(book.getBookClass(),newList);
        }
        //4.添加
        List<Book> list= books.get(book.getBookClass());
        list.add(book);
        books.put(book.getBookClass(),list);
        return true;
    }
    //删除书籍
    public Boolean delBook(String bookName){
        String bookClass = null;
        boolean bookFind=false;
        for(String type: books.keySet()){
            List<Book> bookList=new ArrayList<Book>();
            bookList=books.get(type);
            for(Book book1:bookList){
                if(book1.getBookName().equals(bookName)){
                    bookClass=type;
                    bookFind=true;
                }
            }
        }
        if(!bookFind){
            System.out.println("书籍不存在");
            return false;
        }
        else{
            List<Book> bookList=new ArrayList<Book>();
            bookList=books.get(bookClass);
            Iterator<Book> iter = bookList.iterator();
            while (iter.hasNext()) {
                Book aBook = iter.next();
                if (aBook.getBookName().equals(bookName)) {
                    iter.remove();
                }
            }
            books.put(bookClass,bookList);
            return true;
        }
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "name='" + name + '\'' +
                '}'+
                "books='" + books + '\'' +
                '}';
    }
}
