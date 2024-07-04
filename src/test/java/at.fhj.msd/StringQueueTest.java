package at.fhj.msd;

import org.junit.jupiter.api.*;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {

    private static StringQueue stringQueue0;
    private static StringQueue stringQueue1;

    /**
     * Following are the Unit Tests that test for the correct
     * function of the StringQueue
     */

    @BeforeEach
    public void setUp() {
        stringQueue0 = new StringQueue(0);
        stringQueue1 = new StringQueue(4);
    }

    @BeforeEach
    public void beforeEach() {
        StringQueue stringQueue0 = new StringQueue(0);
    }

    @AfterEach
    public void tearDown() {
        StringQueue stringQueue0 = null;
//        StringQueue stringQueue1 = null;
        StringQueue stringQueue2 = null;
//        StringQueue stringQueue3 = null;
    }

    @DisplayName("Testing peek() Method for a StringQueue with size 0")
    @Test
    public void peekZero() {
        assertNull(stringQueue0.peek());
    }

    @DisplayName("Testing peek() Method for an empty StringQueue with size 4")
    @Test
    public void peekEmpty() {
        assertNull(stringQueue1.peek());
    }

    @DisplayName("Testing peek() Method for a full StringQueue with size 4")
    @Test
    public void peekFull() {
        assertTrue(stringQueue1.offer("TestString1"));
        assertTrue(stringQueue1.offer("TestString2"));
        assertTrue(stringQueue1.offer("TestString3"));
        assertTrue(stringQueue1.offer("TestString4"));
        assertEquals("TestString1", stringQueue1.peek());
    }

    @DisplayName("Testing offer() Method for a StringQueue with size 0")
    @Test
    public void testOfferZero() {
        assertFalse(stringQueue0.offer("TestString"));
    }

    @DisplayName("Testing offer() Method for filling a StringQueue with size 4")
    @Test
    public void testFillOfferFill() {
        assertTrue(stringQueue1.offer("TestString1"));
        assertTrue(stringQueue1.offer("TestString2"));
        assertTrue(stringQueue1.offer("TestString3"));
        assertTrue(stringQueue1.offer("TestString4"));
    }

    @DisplayName("Testing offer() Method for overfilling a StringQueue with size 4 ")
    @Test
    public void testOfferOverfill() {
        assertTrue(stringQueue1.offer("TestString1"));
        assertTrue(stringQueue1.offer("TestString2"));
        assertTrue(stringQueue1.offer("TestString3"));
        assertTrue(stringQueue1.offer("TestString4"));
        assertFalse(stringQueue1.offer("TestString5"));
    }

    @DisplayName("Testing poll() Method for a StringQueue with size 0")
    @Test
    public void testPollZero() {
        assertNull(stringQueue0.poll());
    }

    @DisplayName("Testing poll() Method for an empty StringQueue with size 4")
    @Test
    public void testPollEmpty() {
        assertNull(stringQueue0.poll());
    }

    @DisplayName("Testing poll() Method for an full StringQueue with size 0")
    @Test
    public void testPollFull() {
        assertTrue(stringQueue1.offer("TestString1"));
        assertTrue(stringQueue1.offer("TestString2"));
        assertTrue(stringQueue1.offer("TestString3"));
        assertTrue(stringQueue1.offer("TestString4"));
        assertEquals("TestString1", stringQueue1.poll());
        assertEquals("TestString2", stringQueue1.peek());
    }

    @DisplayName("Testing remove() Method for a StringQueue with size 0")
    @Test
    public void testZero() {
        assertThrows(NoSuchElementException.class, () -> stringQueue0.remove());
    }

    @DisplayName("Testing remove() Method for an empty StringQueue with size 4")
    @Test
    public void testRemoveEmpty() {
        assertThrows(NoSuchElementException.class, () -> stringQueue1.remove());
    }

    @DisplayName("Testing remove() Method for a full StringQueue with size 4")
    @Test
    public void testRemoveFull() {
        assertTrue(stringQueue1.offer("TestString1"));
        assertTrue(stringQueue1.offer("TestString2"));
        assertTrue(stringQueue1.offer("TestString3"));
        assertTrue(stringQueue1.offer("TestString4"));
        assertEquals("TestString1", stringQueue1.remove());
        assertEquals("TestString2", stringQueue1.peek());
    }

    @DisplayName("Testing remove() Method for a full StringQueue with size 4, removing everything")
    @Test
    public void testRemoveEverything() {
        assertTrue(stringQueue1.offer("TestString1"));
        assertTrue(stringQueue1.offer("TestString2"));
        assertTrue(stringQueue1.offer("TestString3"));
        assertTrue(stringQueue1.offer("TestString4"));
        assertEquals("TestString1", stringQueue1.remove());
        assertEquals("TestString2", stringQueue1.remove());
        assertEquals("TestString3", stringQueue1.remove());
        assertEquals("TestString4", stringQueue1.remove());
        assertThrows(NoSuchElementException.class, () -> stringQueue1.remove());
    }

    @DisplayName("Testing element() Method for a StringQueue with size 0")
    @Test
    public void elementZero() {
        assertThrows(NoSuchElementException.class, () -> stringQueue0.element());
    }

    @DisplayName("Testing peek() Method for an empty StringQueue with size 4")
    @Test
    public void elementEmpty() {
        assertThrows(NoSuchElementException.class, () -> stringQueue1.element());
    }

    @DisplayName("Testing peek() Method for a full StringQueue with size 4")
    @Test
    public void elementFull() {
        assertTrue(stringQueue1.offer("TestString1"));
        assertTrue(stringQueue1.offer("TestString2"));
        assertTrue(stringQueue1.offer("TestString3"));
        assertTrue(stringQueue1.offer("TestString4"));
        assertEquals("TestString1", stringQueue1.element());
    }
}