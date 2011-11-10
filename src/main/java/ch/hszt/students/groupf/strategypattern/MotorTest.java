package ch.hszt.students.groupf.strategypattern;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotorTest {
  
  private Motor motor;

  @Before
  public void setUp() throws Exception {
    motor = new Motor();
  }

  @Test
  public void testStartUndStopMotor() {
    assertFalse(motor.isMotorOn());
    motor.startMotor();
    assertTrue(motor.isMotorOn());
    motor.stopMotor();
    assertFalse(motor.isMotorOn());
  }

  @Test
  public void testSetUndGetHubraum() {
    assertEquals(0, motor.getHubraum());
    motor.setHubraum(1200);
    assertEquals("Hubraum", 1200, motor.getHubraum());
  }

}
