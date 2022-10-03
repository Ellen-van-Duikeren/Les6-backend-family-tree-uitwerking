import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {
    @Test
    public void petNameShouldNotBeChangedDuringCreation() {
        Pet pet = new Pet();
        pet.setName("Micky");
        assertEquals("Micky", pet.getName());
    }

    @Test
    public void PetOwnerShouldNotBeChangedDuringCreation () {
        Pet pet = new Pet();
        Person owner = new Person();
        pet.addOwner(owner);
        assertEquals(owner.getName(), pet.getOwner().getName());
    }

}
