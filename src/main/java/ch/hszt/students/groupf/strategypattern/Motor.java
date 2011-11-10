package ch.hszt.students.groupf.strategypattern;
public class Motor
{
    private boolean motorOn;
    
    private int hubraum;
    
    public Motor() {
        motorOn = false;
    }
    
    public void startMotor() {
        motorOn = true;
    }
    
    public void stopMotor() {
        motorOn = false;
    }
    
    public boolean isMotorOn() {
        return motorOn;
    }
    
    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }
    
    public int getHubraum() {
        return hubraum;
    }
}
