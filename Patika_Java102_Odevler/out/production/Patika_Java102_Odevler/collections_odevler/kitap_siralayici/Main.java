package collections_odevler.kitap_siralayici;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Kitap1", 100, "Abc", 2001);
        Book b2 = new Book("Kitap2", 101, "Abc", 2001);
        Book b3 = new Book("Kitap3", 150, "Abc", 2001);
        Book b4 = new Book("Kitap4", 30, "Abc", 2001);
        Book b5 = new Book("Kitap5", 120, "Abc", 2001);
        HashSet<Book> set1 = new HashSet<>();
        set1.add(b1);
        set1.add(b2);
        set1.add(b3);
        set1.add(b4);
        set1.add(b5);
        Iterator<Book> i = set1.iterator();
        while(i.hasNext()) System.out.println(i.next().getName());
        System.out.println();
        TreeSet<Book> tset1 = new TreeSet<>(new BookPageCountComparator());
        tset1.add(b1);
        tset1.add(b2);
        tset1.add(b3);
        tset1.add(b4);
        tset1.add(b5);
        Iterator<Book> i2 = tset1.iterator();
        while(i2.hasNext()) System.out.println(i2.next().getName());
    }
}
