package at.fhj.msd;

import org.junit.jupiter.api.*;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;
import static at.fhj.msd.StringQueue.*;
import static at.fhj.msd.IQueue.*;


public class StringQueueTest {

    private static StringQueue stringQueue0;
    private static StringQueue stringQueue1;
    private static StringQueue stringQueue2;
    private static StringQueue stringQueue3;

    /**
     * Following are the Unit Tests that test for the correct
     * function of the StringQueue
     */

    @BeforeAll
    public static void setUp() {
        stringQueue0 = new StringQueue(0);
        stringQueue1 = new StringQueue(1);
        stringQueue2 = new StringQueue(5);
        stringQueue3 = new StringQueue(100);
    }

    @BeforeEach
    public void beforeEach() {
        StringQueue stringQueue0 = new StringQueue(0);
    }

    @AfterAll
    public static void tearDown() {
        StringQueue stringQueue0 = null;
        StringQueue stringQueue1 = null;
        StringQueue stringQueue2 = null;
        StringQueue stringQueue3 = null;
    }

    @DisplayName("Testing offer() Method")
    @Test
    public void testOffer() {
        assertFalse(stringQueue0.offer("TestString"));
    }
}