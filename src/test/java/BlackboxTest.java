import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BlackboxTest {
    @Test
    public void TC1() {
        Library book = new Library(BookType.SGK, null);
        assertThrows(RuntimeException.class, () -> {
            book.calculateFee();
        });
    }

    @Test
    public void TC2() {
        Library book = new Library(BookType.SGK, -1);
        assertThrows(RuntimeException.class, () -> {
            book.calculateFee();
        });
    }

    
    @Test
    public void TC3() {
        Library book = new Library(BookType.SGK, 0);
        assertEquals("30000đ", book.calculateFee());
    }

    @Test
    public void TC4() {
        Library book = new Library(BookType.SGK, 1);
        assertEquals("35000đ", book.calculateFee());
    }

    @Test
    public void TC5() {
        Library book = new Library(BookType.SGK, 7);
        assertEquals("65000đ", book.calculateFee());
    }

    @Test
    public void TC6() {
        Library book = new Library(BookType.SGK, 14);
        assertEquals("100000đ", book.calculateFee());
    }

    @Test
    public void TC7() {
        Library book = new Library(BookType.SGK, 15);
        assertEquals("105000đ", book.calculateFee());
    }

    @Test
    public void TC8() {
        Library book = new Library(BookType.SGK, 16);
        assertEquals("230000đ", book.calculateFee());
    }

    @Test
    public void TC9() {
        Library book = new Library(BookType.STK, null);
        assertThrows(RuntimeException.class, () -> {
            book.calculateFee();
        });
    }

    @Test
    public void TC10() {
        Library book = new Library(BookType.STK, -1);
        assertThrows(RuntimeException.class, () -> {
            book.calculateFee();
        });
    }

    
    @Test
    public void TC11() {
        Library book = new Library(BookType.STK, 0);
        assertEquals("50000đ", book.calculateFee());
    }

    @Test
    public void TC12() {
        Library book = new Library(BookType.STK, 1);
        assertEquals("55000đ", book.calculateFee());
    }

    @Test
    public void TC13() {
        Library book = new Library(BookType.STK, 7);
        assertEquals("85000đ", book.calculateFee());
    }

    @Test
    public void TC14() {
        Library book = new Library(BookType.STK, 14);
        assertEquals("120000đ", book.calculateFee());
    }

    @Test
    public void TC15() {
        Library book = new Library(BookType.STK, 15);
        assertEquals("125000đ", book.calculateFee());
    }

    @Test
    public void TC16() {
        Library book = new Library(BookType.STK, 16);
        assertEquals("250000đ", book.calculateFee());
    }
}