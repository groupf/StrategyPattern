package ch.hszt.students.groupf.strategypattern;
public class Fahrzeug 
{
    private Signalton signalton;
    private FortbewegungsStrategie fStrategie;
    private String farbe;
    
    public Fahrzeug(String signalton, FortbewegungsStrategie inStrategie) {
    	this.fStrategie = inStrategie;
        this.signalton = new Signalton(signalton);
    }
    
    public void signalGeben() {
      System.out.println(signalton.getSignalton());
    }
    
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    
    public String getFarbe() {
        return farbe;
    }
    /**
     * Diese Methode gibt auf der Console den Text aus der entsprechenden Strategie Klasse aus.
     */
    public void outFahrStrategie() {
    	fStrategie.bewegen();
    	
    }
}

