package at.fhj.msd;

import java.util.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    private static DrinkQueue drinkQueue;
    private static DrinkQueue emptyDrinkQueue;
    private static Queue<Drink> listOfDrinks;
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
        simpleDrinkVodkaGorbatschow = new SimpleDrink("Vodka Gorbatschow", vodka);
        CocktailVodka_Gin = new Cocktail("Vodka-Gin", ingredientList);
        ingredientList = new LinkedList<>();
        ingredientList.add(vodka);
        ingredientList.add(gin);
        listOfDrinks = new LinkedList<>();
        listOfDrinks.add(simpleDrinkVodkaGorbatschow);
        listOfDrinks.add(CocktailVodka_Gin);
        drinkQueue = new DrinkQueue(2);
        emptyDrinkQueue = new DrinkQueue(2);
    }
    @DisplayName("Looks for the correct working of the peek() function if the list is empty")
    @Test
    public void peekEmpty() {
        assertNull(emptyDrinkQueue.peek());
    }
    @DisplayName("Looks for the correct order of the peek() function if the list is not empty")
    @Test
    public void peekFull() {
        assertTrue(drinkQueue.offer(simpleDrinkVodkaGorbatschow));
        assertTrue(drinkQueue.offer(CocktailVodka_Gin));
        assertEquals(SimpleDrink.class, drinkQueue.peek().getClass());
    }
}
