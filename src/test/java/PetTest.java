import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {
    @Test
    public void testEmptyConstructor() {
        Pet pet = new Pet();
        pet.setName("Micky");
        assertEquals("Micky", pet.getName());
    }

    @Test
    public void testConstructor() {
        Pet pet = new Pet("Micky", 3, "bastard");
        assertEquals("Micky", pet.getName());
        assertEquals(3, pet.getAge());
        assertEquals("bastard", pet.getSpecies());
    }

    @Test
    public void ageShouldBeSetWhenSetAge() {
        Pet pet = new Pet();
        pet.setAge(3);
        assertEquals(3, pet.getAge());
    }

    @Test
    public void speciesShouldBeSetWhenSetSpecies() {
        Pet pet = new Pet();
        pet.setSpecies("bastard");
        assertEquals("bastard", pet.getSpecies());
    }

    @Test
    public void ownerShouldBeSetWhenSetOwner() {
        Person owner = new Person();
        Pet pet = new Pet();
        pet.setOwner(owner);
        assertEquals(owner, pet.getOwner());
    }

    @Test
    public void PetOwnerShouldNotBeChangedDuringCreation () {
        Pet pet = new Pet();
        Person owner = new Person();
        pet.addOwner(owner);
        assertEquals(owner.getName(), pet.getOwner().getName());
    }
}
