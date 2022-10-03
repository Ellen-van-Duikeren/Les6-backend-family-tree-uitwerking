import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<>();

    private List<Person> children = new ArrayList<>();
    private List<Person> grandChildren = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();


    //---- constructor-------------------------------------------------------------------------------------
    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    //---- methods-------------------------------------------------------------------------------------------
    public Person() {
        this.name = "John";
        this.lastName = "Doe";
        this.sex = "M";
        this.age = 25;
    }

    public void addParents(Person father, Person mother) {
        this.father = father;
        this.mother = mother;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);
    }

    public void addGrandChildren(Person grandChild) {
        grandChildren.add(grandChild);
    }


    //    bonusopdracht 1. Schrijf een methode om alle dieren van de kleinkinderen terug te geven van een persoon.
    public List<Pet> getPetsFromGrandChildren(Person person) {
        List<Pet> petsFromGrandChildren = null;
        for (int i = 0; i < person.getGrandChildren().size(); i++) {
            for (int j = 0; j < person.getGrandChildren().get(i).getPets().size(); j++) {
                petsFromGrandChildren.add(person.getGrandChildren().get(i).getPets().get(j));
            }
        }
        return petsFromGrandChildren;
    }

    //---- gettersNsetters-----------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getGrandChildren() {
        return grandChildren;
    }

    public void setGrandChildren(List<Person> grandChildren) {
        this.grandChildren = grandChildren;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}



