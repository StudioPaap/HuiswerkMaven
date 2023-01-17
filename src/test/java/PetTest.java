import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void addOwner() {
        //assets
        Pet cat = new Pet("Poekie", '2', "CHECKERED");
        //act
        cat.addOwner(new Person("piet", "Bell", 12, "male"));
        //assert
        assertEquals(1, cat.getOwners().size());

    }
}