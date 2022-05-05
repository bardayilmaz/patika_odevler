package collections_odevler.kitap_siralayici;

import java.util.Comparator;

public class BookPageCountComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPageCount() - o2.getPageCount();
    }
}
