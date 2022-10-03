import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    @Test
    public void nameShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        person.setName("Jane");
        assertEquals("Jane", person.getName());
    }

    @Test
    public void lastNameShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        person.setLastName("Elliot");
        assertEquals("Elliot", person.getLastName());
    }

    @Test
    public void sexShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        person.setSex("F");
        assertEquals("F", person.getSex());
    }

    @Test
    public void ageShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        person.setAge(34);
        assertEquals(34, person.getAge());
    }

    @Test
    public void personWithoutNameShouldBeNamedJohn() {
        Person person = new Person();
        assertEquals("John", person.getName());
    }

    @Test
    public void parentsShouldNotBeChangedDuringCreation () {
        Person person = new Person();
        Person father = new Person();
        Person mother = new Person();
        person.addParents(father, mother);
        assertEquals(father.getName(), person.getFather().getName());
        assertEquals(mother.getName(), person.getMother().getName());
    }

    @Test
    public void fatherShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        Person father = new Person();
        person.setFather(father);
        assertEquals(father.getName(), person.getFather().getName());
    }

    @Test
    public void motherShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        Person mother = new Person();
        person.setMother(mother);
        assertEquals(mother.getName(), person.getMother().getName());
    }


    @Test
    public void childShouldBeAddedToList() {
        Person person = new Person();
        Person child = new Person();
        person.addChild(child);
        assertEquals(1, person.getChildren().size());
        assertEquals(child.getName(), person.getChildren().get(0).getName());
    }

    @Test
    public void petShouldBeAddedToList() {
        Person person = new Person();
        Pet pet = new Pet();
        person.addPet(pet);
        assertEquals(1, person.getPets().size());
        assertEquals(pet.getName(), person.getPets().get(0).getName());
    }

    @Test
    public void siblingShouldBeAddedToList() {
        Person person = new Person();
        Person sibling = new Person();
        person.addSibling(sibling);
        assertEquals(1, person.getSiblings().size());
        assertEquals(sibling.getName(), person.getSiblings().get(0).getName());
    }

    @Test
    public void grandChildShouldBeAddedToList() {
        Person person = new Person();
        Person grandChild = new Person();
        person.addGrandChildren(grandChild);
        assertEquals(1, person.getGrandChildren().size());
        assertEquals(grandChild.getName(), person.getGrandChildren().get(0).getName());
    }

    @Test
    public void listOfPetsOfGrandChildrenShouldBeReturned () {
        Person person = new Person();
        Person grandChild = new Person();
        Pet pet = new Pet();
        person.addGrandChildren(grandChild);
        grandChild.addPet(pet);
        person.getPetsFromGrandChildren(person);
        assertEquals(1, person.getGrandChildren().get(0).getPets().size());
        assertEquals(grandChild.getPets().get(0).getName(), person.getGrandChildren().get(0).getPets().get(0).getName());
    }


}
