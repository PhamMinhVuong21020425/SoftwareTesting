import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataFlowTest {
    @Test
    public void TC1() {
        Library book = new Library(BookType.SGK, 8);
        assertEquals("70000đ", book.calculateFeeC2());
    }

    @Test
    public void TC2() {
        Library book = new Library(BookType.STK, 8);
        assertEquals("90000đ", book.calculateFeeC2());
    }
    
    @Test
    public void TC3() {
        Library book = new Library(BookType.OTHER, 10);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }

    @Test
    public void TC4() {
        Library book = new Library(BookType.SGK, null);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }

    @Test
    public void TC5() {
        Library book = new Library(BookType.SGK, -2);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }

    @Test
    public void TC6() {
        Library book = new Library(BookType.STK, -2);
        assertEquals("Invalid Input", book.calculateFeeC2());
    }

    @Test
    public void TC7() {
        Library book = new Library(BookType.SGK, 18);
        assertEquals("230000đ", book.calculateFeeC2());
    }

    @Test
    public void TC8() {
        Library book = new Library(BookType.STK, 18);
        assertEquals("250000đ", book.calculateFeeC2());
    }
}
