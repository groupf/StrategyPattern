package ch.hszt.students.groupf.strategypattern;
public class Motorschiff extends Motorfahrzeug
{

    private int wasserverdraengung;
    private String name;

    /**
     * Constructor for objects of class Schiff
     */
    public Motorschiff()
    {
        super("Hoooooorn", new SchwimmenStrategie());
    }

    
    public void setWasserverdraengung(int cm3) {
        this.wasserverdraengung = cm3;
    }
    
    public int getWasserverdraengung() {
        return wasserverdraengung;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
