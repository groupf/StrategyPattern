package ch.hszt.students.groupf.strategypattern;
public class Velo extends Fahrzeug
{

    private int anzahlGaenge;

    /**
     * Constructor for objects of class Velo
     */
    public Velo(int anzahlGaenge)
    {   
        super("klingeling", new FahrenStrategie());
        this.anzahlGaenge = anzahlGaenge;
    }
    
    public int getAnzahlGaenge() {
        return anzahlGaenge;
    }


}
