package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Qube on 7/19/16.
 */
public class LionTest {

    public Lion tonyTheTiger = new Lion(true);

    @Test
    public void lionShouldRoar() throws Exception {
        assertEquals("Roar!!!", tonyTheTiger.makeNoise());
    }

    @Test
    public void lionShouldHaveThisTopSpeed() throws Exception {
        assertEquals(50, tonyTheTiger.getTopSpeed());
    }

    @Test
    public void tonyTheTigerShouldBeAlpha() throws Exception {
        assertEquals(true, tonyTheTiger.isAlpha());
    }
}
