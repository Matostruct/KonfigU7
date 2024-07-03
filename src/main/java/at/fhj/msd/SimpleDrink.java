package at.fhj.msd;
/**
 * Class represents a simple drink liquid which can be used in
 * drinks
 */
public class SimpleDrink extends Drink{
    /**
     * uses only one liquid
     */
    protected Liquid liquid;
    /**
     * Creates a SimpleDrink object with given brand name and the
     * liquid it contains
     *
     * @param name name of drink
     * @param liquid only liquid in drink
     */
    SimpleDrink(String name, Liquid liquid){
        super(name);
        this.liquid = liquid;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return liquid.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return liquid.getAlcoholPercent();
    }
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(liquid.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }
}
