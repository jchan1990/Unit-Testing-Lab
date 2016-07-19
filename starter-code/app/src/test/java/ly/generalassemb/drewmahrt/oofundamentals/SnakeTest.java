package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qube on 7/19/16.
 */
public class SnakeTest {

    @Test
    public void testIfCorrectSound() throws Exception {
        Snake ekans = new Snake(true);

        String expected = "Hiss!!!";
        String actual = ekans.makeNoise();

        assertEquals(expected, actual);
    }

    @Test
    public void testifCorrectTopSpeed() {
        Snake ekans = new Snake(false);

        int expected = 5;
        int actual = ekans.getTopSpeed();

        assertEquals(expected, actual);
    }
}
