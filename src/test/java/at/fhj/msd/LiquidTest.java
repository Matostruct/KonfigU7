package at.fhj.msd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;


public class LiquidTest {
    /**
     * Following are the Unit Tests that test the different Drink Classes
     */

    private static Liquid vodka;
    private static Liquid gin;
    private static SimpleDrink simpleDrinkVodkaGorbatschow;
    private static Cocktail CocktailVodka_Gin;
    private static List<Liquid> ingredientList;

    @BeforeEach
    public void setUp() {
        vodka = new Liquid("Vodka", 0.5, 0.80);
        gin = new Liquid("Gin", 0.25, 0.45);
        ingredientList = new LinkedList<>();
        ingredientList.add(vodka);
        ingredientList.add(gin);
        simpleDrinkVodkaGorbatschow = new SimpleDrink("Vodka Gorbatschow", vodka);
        CocktailVodka_Gin = new Cocktail("Vodka-Gin", ingredientList);
    }

    /**
     * Testing the different Methods of the Liquid Class
     */

    @DisplayName("Testing the Liquid getName() Method")
    @Test
    public void testLiquidGetName() {
        assertEquals("Vodka", vodka.getName());
    }

    @DisplayName("Testing the Liquid setName() Method")
    @Test
    public void testLiquidSetName() {
        assertEquals("Vodka", vodka.getName());
        vodka.setName("Gin");
        assertEquals("Gin", vodka.getName());
    }

    @DisplayName("Testing the Liquid getVolume() Method")
    @Test
    public void testLiquidGetVolume() {
        assertEquals(0.5, vodka.getVolume());
    }

    @DisplayName("Testing the Liquid setVolume() Method")
    @Test
    public void testLiquidSetVolume() {
        assertEquals(0.5, vodka.getVolume());
        vodka.setVolume(0.4);
        assertEquals(0.4, vodka.getVolume());
    }

    @DisplayName("Testing the Liquid getAlcoholPercent() Method")
    @Test
    public void testLiquidGetAlcoholPercent() {
        assertEquals(0.80, vodka.getAlcoholPercent());
    }

    @DisplayName("Testing the Liquid setAlcoholPercent() Method")
    @Test
    public void testLiquidSetAlcoholPercent() {
        assertEquals(0.80, vodka.getAlcoholPercent());
        vodka.setAlcoholPercent(0.50);
        assertEquals(0.50, vodka.getAlcoholPercent());
    }
}
