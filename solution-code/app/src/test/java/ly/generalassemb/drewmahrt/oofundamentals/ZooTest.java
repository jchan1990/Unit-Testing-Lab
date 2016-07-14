package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * James Davis (General Assembly NYC)
 * Created on 4/26/16.
 */
public class ZooTest {
    @Test
    public void testAddingAnimals() throws Exception {
        Zoo zoo = Zoo.getInstance();

        assertNotNull(zoo);

        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(false));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(false));

        assertTrue(zoo.getAnimals().size() == 6);

    }

    @Test
    public void testRemovingAnimals() throws Exception {
        Zoo zoo = Zoo.getInstance();

        assertNotNull(zoo);

        int currentNumberOfAnimals = zoo.getAnimals().size();

        Lion lionToRemove = new Lion(false);

        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(false));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(lionToRemove);
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(false));
        currentNumberOfAnimals += 7;

        zoo.removeAnimal(lionToRemove);
        int expectedNumberOfAnimals = currentNumberOfAnimals - 1;

        assertTrue(zoo.getAnimals().size() == expectedNumberOfAnimals);

    }
}
