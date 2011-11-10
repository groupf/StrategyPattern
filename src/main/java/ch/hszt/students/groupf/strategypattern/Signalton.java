package ch.hszt.students.groupf.strategypattern;
public class Signalton
{
    private String ton;
    
    public Signalton(String ton) {
        this.ton = ton;
    }
    
    public String getSignalton() {
        return ton;
    }
}
