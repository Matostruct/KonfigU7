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

}
