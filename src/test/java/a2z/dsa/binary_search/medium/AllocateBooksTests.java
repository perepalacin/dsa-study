package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.AllocateBooks;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class AllocateBooksTests {

    @Test
    public void Test1() {
        ArrayList<Integer> bookPages = new ArrayList<>();
        bookPages.add(12);
        bookPages.add(34);
        bookPages.add(67);
        bookPages.add(90);
        Assert.assertEquals(113, AllocateBooks.findPages(bookPages, 4,2));
    }

    @Test
    public void Test2() {
        ArrayList<Integer> bookPages = new ArrayList<>();
        bookPages.add(25);
        bookPages.add(46);
        bookPages.add(28);
        bookPages.add(49);
        bookPages.add(24);
        Assert.assertEquals(71, AllocateBooks.findPages(bookPages, 5,4));
    }

    @Test
    public void Test3() {
        ArrayList<Integer> bookPages = new ArrayList<>();
        bookPages.add(2);
        bookPages.add(8);
        bookPages.add(8);
        bookPages.add(4);
        bookPages.add(5);
        Assert.assertEquals(-1, AllocateBooks.findPages(bookPages, 5,6));
    }

    @Test
    public void Test4() {
        ArrayList<Integer> bookPages = new ArrayList<>();
        bookPages.add(1);
        bookPages.add(17);
        bookPages.add(14);
        bookPages.add(9);
        bookPages.add(15);
        bookPages.add(9);
        bookPages.add(14);
        Assert.assertEquals(17, AllocateBooks.findPages(bookPages, 7,7));
    }
}
