package ch.hszt.students.groupf.strategypattern;
public class Auto extends Motorfahrzeug
{

    private String autoNr;
    
    public Auto() {
        super("huup", new FahrenStrategie());
    }
    
    public String getAutoNr() {
        return autoNr;
    }
    
    public void setAutoNr(String nr) {
        autoNr = nr;
    }
    
}
