package ch.hszt.students.groupf.strategypattern;
public class Motorfahrzeug extends Fahrzeug
{
    private Motor motor;
    
    public Motorfahrzeug(String ton, FortbewegungsStrategie inStrategie) {
        super(ton, inStrategie);
        motor = new Motor();
    }
    
    public void motorStarten() {
        motor.startMotor();
    }
    
    public void motorStoppen() {
        motor.stopMotor();
    }
    
    
    public boolean isMotorOn() {
        return motor.isMotorOn();
    }

}
