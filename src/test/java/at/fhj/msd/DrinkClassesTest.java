package at.fhj.msd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;


public class DrinkClassesTest {
    /**
     * Following are the Unit Tests that test the different Drink Classes
     */

    private static Liquid vodka;
    private static Liquid gin;
    private static SimpleDrink simpleDrinkVodkaGorbatschow;
    private static Cocktail cocktailVodka_Gin;
    private static List<Liquid> ingredientList;

    @BeforeEach
    public void setUp() {
        vodka = new Liquid("Vodka", 1, 0.80);
        gin = new Liquid("Gin", 0.25, 0.40);
        ingredientList = new LinkedList<>();
        ingredientList.add(vodka);
        ingredientList.add(gin);
        simpleDrinkVodkaGorbatschow = new SimpleDrink("Vodka Gorbatschow", vodka);
        cocktailVodka_Gin = new Cocktail("Vodka-Gin", ingredientList);
    }

    /**
     * Testing the different Methods of the Drink Superclass
     * by Testing the Cocktail and the SimpleDrink class.
     */

    @DisplayName("Testing the getname() Method")
    @Test
    public void testGetName() {
        assertEquals("Vodka Gorbatschow", simpleDrinkVodkaGorbatschow.getName());
    }

    @DisplayName("Testing the setName() Method")
    @Test
    public void testSetName() {
        assertEquals("Vodka Gorbatschow", simpleDrinkVodkaGorbatschow.getName());
        simpleDrinkVodkaGorbatschow.setName("Gorbatschow's Vodka");
        assertEquals("Gorbatschow's Vodka", simpleDrinkVodkaGorbatschow.getName());
    }

    @DisplayName("Testing the getVolume() Method")
    @Test
    public void testGetVolume() {
        assertEquals(1, simpleDrinkVodkaGorbatschow.getVolume());
        assertEquals(1.25, cocktailVodka_Gin.getVolume());
    }

    @DisplayName("Testing the getAlcoholPercent() Method")
    @Test
    public void testGetAlcoholPercent() {
        assertEquals(0.80, simpleDrinkVodkaGorbatschow.getAlcoholPercent());
        assertEquals(0.72, cocktailVodka_Gin.getAlcoholPercent());
    }

}
