package at.fhj.msd;

public class Liquid {

    private String name;
     
    private double volume;

    private double alcoholPercent;

    /**
     * Creates an alcoholic liquid consisting of
     *
     * @param name the name of the liquid
     * @param volume the volume of the liquid
     * @param alcoholPercent the percent alcohol per volume
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
