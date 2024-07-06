package at.fhj.msd;

import java.util.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    private static DrinkQueue drinkQueue;
    private static List<Liquid> ingredientList;
    private static Liquid vodka;
    private static Liquid gin;
    private static SimpleDrink simpleDrinkVodkaGorbatschow;
    private static Cocktail CocktailVodka_Gin;

    /**
     * Following are the Unit Tests that test for the correct
     * function of the DrinkQueue
     */

    @BeforeEach
    public void setUp() {
        vodka = new Liquid("Vodka", 0.5, 0.80);
        gin = new Liquid("Gin", 0.25, 0.45);
        ingredientList = new LinkedList<>();
        ingredientList.add(vodka);
        ingredientList.add(gin);
        simpleDrinkVodkaGorbatschow = new SimpleDrink("Vodka Gorbatschow", vodka);
        CocktailVodka_Gin = new Cocktail("Vodka-Gin", ingredientList);
        drinkQueue = new DrinkQueue(3);
    }

    @AfterEach
    public void tearDown() {
        drinkQueue = null;
    }

    @DisplayName("Looks for the correct working of the isEmpty() function")
    @Test
    public void isEmptyTest() {
        assertTrue(drinkQueue.isEmpty());
    }

    @DisplayName("Looks for the correct working of the peek() function if the list is empty")
    @Test
    public void peekEmptyTest() {
        assertNull(drinkQueue.peek());
    }

    @DisplayName("Looks for the correct order of the peek() function if the list is not empty")
    @Test
    public void peekFullTest() {
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertTrue(drinkQueue.offer(CocktailVodka_Gin));
        assertEquals(SimpleDrink.class, drinkQueue.peek().getClass());
    }

    @DisplayName("Test the correct working of the offer() functions size metrik")
    @Test
    public void offerSizeTest() {
        assertEquals(0, drinkQueue.getSize());
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertTrue(drinkQueue.offer(CocktailVodka_Gin));
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertEquals(3, drinkQueue.getSize());
    }

    @DisplayName("Test the correct working of the offer() function if full")
    @Test
    public void offerFullTest() {
        assertEquals(0, drinkQueue.getSize());
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertTrue(drinkQueue.offer(CocktailVodka_Gin));
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertFalse(drinkQueue.offer(CocktailVodka_Gin));
        assertEquals(3, drinkQueue.getSize());
    }

    @DisplayName("Test the correct working of the poll() function on an empty list")
    @Test
    public void pollEmptyTest() {
        assertNull(drinkQueue.poll());
    }

    @DisplayName("Test the correct working of the poll() function on a full list")
    @Test
    public void pollFullTest() {
        assertEquals(0, drinkQueue.getSize());
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertTrue(drinkQueue.offer(CocktailVodka_Gin));
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertEquals(3, drinkQueue.getSize());
        assertEquals(SimpleDrink.class, drinkQueue.poll().getClass());
        assertEquals(Cocktail.class, drinkQueue.poll().getClass());
        assertEquals(SimpleDrink.class, drinkQueue.poll().getClass());
        assertEquals(0, drinkQueue.getSize());
    }

    @DisplayName("Test the correct working of the remove() function on an empty")
    @Test
    public void removeEmptyTest() {
        assertThrows(NoSuchElementException.class, drinkQueue::remove);
    }

    @DisplayName("Test the correct working of the remove() function on a full list")
    @Test
    public void removeFullTest() {
        assertEquals(0, drinkQueue.getSize());
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertTrue(drinkQueue.offer(CocktailVodka_Gin));
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertEquals(3, drinkQueue.getSize());
        assertEquals(SimpleDrink.class, drinkQueue.remove().getClass());
        assertEquals(Cocktail.class, drinkQueue.remove().getClass());
        assertEquals(SimpleDrink.class, drinkQueue.remove().getClass());
        assertEquals(0, drinkQueue.getSize());
    }

    @DisplayName("Test the correct working of the element() function on an empty list")
    @Test
    public void elementEmptyTest() {
        assertThrows(NoSuchElementException.class, drinkQueue::element);
    }

    @DisplayName("Test the correct working of the element() function on a full list")
    @Test
    public void elementFullTest() {
        assertEquals(0, drinkQueue.getSize());
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertTrue(drinkQueue.offer(CocktailVodka_Gin));
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertEquals(3, drinkQueue.getSize());
        assertEquals(SimpleDrink.class, drinkQueue.element().getClass());
    }
}
