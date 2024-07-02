package at.fhj.msd;

import at.fhj.iit.Drink;
import at.fhj.iit.Liquid;

import java.util.*;

public class Cocktail extends Drink {

    /**
     * Creates a Drink object with given name and a list of ingredients
     *
     * @param name name of the drink
     * @param List<Liquid> ingredients of the cocktail
     */
    protected List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }
}
