package ch.hszt.students.groupf.strategypattern;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotorschiffTest {
  
  private Motorschiff schiff;

  @Before
  public void setUp() throws Exception {
    schiff = new Motorschiff();
  }

  @Test
  public void testSetName() {
    assertNull(schiff.getName());
    schiff.setName("Panta Rhei");
    assertEquals("Panta Rhei", schiff.getName());
  }

  @Test
  public void testSetFarbe() {
    assertNull(schiff.getFarbe());
    schiff.setFarbe("Blau");
    assertEquals("Blau", schiff.getFarbe());
  }
  
  @Test
  public void testMotorStartenUndStoppen() {
    assertFalse(schiff.isMotorOn());
    schiff.motorStarten();
    assertTrue(schiff.isMotorOn());
    schiff.motorStoppen();
    assertFalse(schiff.isMotorOn());
  }

}
