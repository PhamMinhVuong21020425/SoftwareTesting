import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {
    @Test
    public void TC1() {
        Library book = new Library(BookType.SGK, null);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }

    @Test
    public void TC2() {
        Library book = new Library(BookType.SGK, 7);
        assertEquals("65000đ", book.calculateFeeC2());
    }
    
    @Test
    public void TC3() {
        Library book = new Library(BookType.SGK, 16);
        assertEquals("230000đ", book.calculateFeeC2());
    }

    @Test
    public void TC4() {
        Library book = new Library(BookType.SGK, -1);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }

    @Test
    public void TC5() {
        Library book = new Library(BookType.OTHER, 10);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }

    @Test
    public void TC6() {
        Library book = new Library(BookType.STK, 7);
        assertEquals("85000đ", book.calculateFeeC2());
    }

    @Test
    public void TC7() {
        Library book = new Library(BookType.STK, 16);
        assertEquals("250000đ", book.calculateFeeC2());
    }

    @Test
    public void TC8() {
        Library book = new Library(BookType.STK, -1);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }
}
