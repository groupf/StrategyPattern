package ch.hszt.students.groupf.strategypattern;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutoTest {
  
  private Auto auto;

  @Before
  public void setUp() throws Exception {
    auto = new Auto();
  }

  @Test
  public void testSetAutoNr() {
    assertNull(auto.getAutoNr());
    auto.setAutoNr("ZH 1234");
    assertEquals("ZH 1234", auto.getAutoNr());
  }

  @Test
  public void testSetFarbe() {
    assertNull(auto.getFarbe());
    auto.setFarbe("Blau");
    assertEquals("Blau", auto.getFarbe());
  }
  
  @Test
  public void testMotorStartenUndStoppen() {
    assertFalse(auto.isMotorOn());
    auto.motorStarten();
    assertTrue(auto.isMotorOn());
    auto.motorStoppen();
    assertFalse(auto.isMotorOn());
  }

}
