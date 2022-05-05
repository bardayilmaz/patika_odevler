package collections_odevler.kitap_siralayici;

public class Book implements Comparable{
    private String name;
    private int pageCount;
    private String authorName;
    private int publishYear;

    public Book(String name, int pageCount, String authorName, int publishYear) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public int compareTo(Object o) {
        Book otherBook = null;
        if(o instanceof Book) otherBook = (Book)o;
        else return -2;
        return getName().compareTo(otherBook.getName());
    }
}
