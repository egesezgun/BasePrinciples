package src;

public class Book {
    public String name;
    private int pageNumber;

    public Book(String name, int pageNumber){
        this.name=name;
        this.pageNumber=pageNumber;
    }
    public int getPageNumber() {
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){
        if (pageNumber<0){
            pageNumber=0;
        }
     this.pageNumber = pageNumber;
    }
}
