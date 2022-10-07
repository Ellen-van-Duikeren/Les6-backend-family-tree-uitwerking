import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void testConstructorWithoutMiddleName() {
        //arrange & act
        Person p = new Person("John", "Doe", "M", 34);
        //assert
        assertEquals("John", p.getName());
        assertEquals("Doe", p.getLastName());
        assertEquals("M", p.getSex());
        assertEquals(34, p.getAge());
    }

    @Test
    public void testConstructorWithMiddleName() {
        //arrange & act
        Person p = new Person("John", "van", "Doe", "M", 34);
        //assert
        assertEquals("John", p.getName());
        assertEquals("van", p.getMiddleName());
        assertEquals("Doe", p.getLastName());
        assertEquals("M", p.getSex());
        assertEquals(34, p.getAge());
    }

    @Test
    public void nameShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        person.setName("Jane");
        assertEquals("Jane", person.getName());
    }

    @Test
    public void middleNameShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        person.setMiddleName("van");
        assertEquals("van", person.getMiddleName());
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
    public void whenSetPartnerAPartnerShouldBeSet() {
        Person person = new Person();
        Person partner = new Person();
        partner.setPartner(partner);
        assertEquals(partner, partner.getPartner());
    }

    @Test
    public void partnerShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        Person partner = new Person();
        person.addPartner(partner);
        assertEquals(partner, person.getPartner());
    }


    @Test
    public void parentsShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        Person father = new Person();
        Person mother = new Person();
        person.addParents(father, mother);
        assertEquals(father, person.getFather());
        assertEquals(mother, person.getMother());
    }

    @Test
    public void fatherShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        Person father = new Person();
        person.setFather(father);
        assertEquals(father, person.getFather());
    }

    @Test
    public void motherShouldNotBeChangedDuringCreation() {
        Person person = new Person();
        Person mother = new Person();
        person.setMother(mother);
        assertEquals(mother, person.getMother());
    }

    @Test
    public void siblingsShouldNotBeChangedDuringCreation() {
        //arrange
        Person person = new Person();
        Person sibling = new Person();
        Person sibling2 = new Person();
        List<Person> expectedListSiblings = Arrays.asList(sibling, sibling2);
        //act
        person.setSiblings(expectedListSiblings);
        //assert
        assertEquals(expectedListSiblings, person.getSiblings());
    }

    @Test
    public void childrenShouldNotBeChangedDuringCreation() {
        //arrange
        Person person = new Person();
        Person child = new Person();
        Person child2 = new Person();
        List<Person> expectedListChildren = Arrays.asList(child, child2);
        //act
        person.setChildren(expectedListChildren);
        //assert
        assertEquals(expectedListChildren, person.getChildren());
    }

    @Test
    public void grandChildrenShouldNotBeChangedDuringCreation() {
        //arrange
        Person person = new Person();
        Person grandChild = new Person();
        Person grandChild2 = new Person();
        List<Person> expectedListGrandChildren = Arrays.asList(grandChild, grandChild2);
        //act
        person.setGrandChildren(expectedListGrandChildren);
        //assert
        assertEquals(expectedListGrandChildren, person.getGrandChildren());
    }

    @Test
    public void petsShouldNotBeChangedDuringCreation() {
        //arrange
        Person person = new Person();
        Pet pet = new Pet();
        Pet pet2 = new Pet();
        List<Pet> expectedListPets = Arrays.asList(pet, pet2);
        //act
        person.setPets(expectedListPets);
        //assert
        assertEquals(expectedListPets, person.getPets());
    }

    @Test
    public void childShouldBeAddedToList() {
        Person person = new Person();
        Person child = new Person();
        person.addChild(child);
        assertEquals(1, person.getChildren().size());
        assertEquals(child, person.getChildren().get(0));
    }

    @Test
    public void petShouldBeAddedToList() {
        Person person = new Person();
        Pet pet = new Pet();
        person.addPet(pet);
        assertEquals(1, person.getPets().size());
        assertEquals(pet, person.getPets().get(0));
    }

    @Test
    public void siblingShouldBeAddedToList() {
        Person person = new Person();
        Person sibling = new Person();
        person.addSibling(sibling);
        assertEquals(1, person.getSiblings().size());
        assertEquals(sibling, person.getSiblings().get(0));
    }

    @Test
    public void grandChildShouldBeAddedToList() {
        Person person = new Person();
        Person grandChild = new Person();
        person.addGrandChildren(grandChild);
        assertEquals(1, person.getGrandChildren().size());
        assertEquals(grandChild, person.getGrandChildren().get(0));
    }

    @Test
    public void listOfPetsOfGrandChildrenShouldBeReturned() {
        Person person = new Person();
        Person grandChild = new Person();
        Pet pet = new Pet();
        pet.setName("Kuifje");
        person.addGrandChildren(grandChild);
        grandChild.addPet(pet);
        person.getPetsFromGrandChildren(person);
        assertEquals(1, person.getGrandChildren().get(0).getPets().size());
        assertEquals(grandChild.getPets().get(0).getName(), person.getGrandChildren().get(0).getPets().get(0).getName());
    }

    @Test
    public void listOfNiecesOfPersonShouldBeReturned() {
        //arrange
        Person person = new Person();
        Person sibling = new Person();
        Person childSibling = new Person();
        Person childSibling2 = new Person();
        Person childSibling3 = new Person();
        //act
        person.addSibling(sibling);
        sibling.addChild(childSibling);
        sibling.addChild(childSibling2);
        sibling.addChild(childSibling3);
        childSibling.setSex("M");
        childSibling2.setSex("F");
        childSibling3.setSex("F");
        List<Person> expectedListSiblings = Arrays.asList(childSibling2, childSibling3);
        //assert
        assertEquals(expectedListSiblings, person.getNiecesFromPerson(person));
    }

}
