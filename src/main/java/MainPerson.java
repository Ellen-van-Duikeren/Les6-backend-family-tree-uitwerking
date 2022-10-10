import java.util.Arrays;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        //arrange
        Person person = new Person("John", "Doe", "M", 81);
        Person child = new Person("Janie", "Doe", "F", 52);
        Person grandChild1 = new Person("Richard", "Doe", "F", 21);
        Person grandChild2 = new Person("Janie jr", "Doe", "F", 20);
        Person sibling = new Person("Olivia", "Doe", "F", 86);
        Person sibling2 = new Person("Marc", "Doe", "M", 84);

        //act
        person.addChild(child);
        person.addGrandChildren(grandChild1);
        person.addGrandChildren(grandChild2);
        person.addSibling(sibling);
        person.addSibling(sibling2);

        //souts
        System.out.println("Head of the family:");
        System.out.println(person.getName() + " " + person.getLastName() + ", sex: " + person.getSex() + ", " + person.getAge() + " years old.");

        System.out.println("\nChild:");
        System.out.println(person.getChildren().get(0).getName() + " " + person.getChildren().get(0).getLastName() + ", sex: " + person.getChildren().get(0).getSex() + ", " + person.getChildren().get(0).getAge() + " years old.");

        System.out.println("\nGrandchildren:");
        for (int i = 0; i < person.getGrandChildren().size(); i++) {
            System.out.println(person.getGrandChildren().get(i).getName() + " " + person.getGrandChildren().get(i).getLastName() + ", sex: " + person.getGrandChildren().get(i).getSex() + ", " + person.getGrandChildren().get(i).getAge() + " years old.");
        }

        System.out.println("\nSiblings of " + person.getName() + ":");
        for (int i = 0; i < person.getSiblings().size(); i++) {
            System.out.println(person.getSiblings().get(i).getName());
        }

        //bonusexercise 1
        //arrange
        Pet pet1 = new Pet("Wooof", 2, "dog");
        Pet pet2 = new Pet("Meow", 3, "cat");
        //act
        grandChild1.addPet(pet1);
        grandChild2.addPet(pet2);
        //sout
        System.out.println("\nPets of the grandchildren of " + person.getName() + ":");
        person.getPetsFromGrandChildren(person);

        //bonusexercise 2
        //arrange
        System.out.println("\nNieces of " + person.getName() + ":");
        Person emma = new Person("Emma", "Doe", "F", 56);
        Person charlotte = new Person("Charlotte", "Doe", "F", 56);
        Person liam = new Person("Liam", "Doe", "M", 52);
        //act
        sibling.addChild(emma);
        sibling.addChild(charlotte);
        sibling.addChild(liam);

        //sout
        for (int i = 0; i < person.getNiecesFromPerson(person).size(); i++) {
            System.out.println(person.getNiecesFromPerson(person).get(i).getName());
        }

        //bonusexercise 3
        System.out.println("\nPartner of " + person.getName() + ": ");
        //arrange
        Person partner = new Person("Jane", "Doe", "F", 77);
        //act
        person.addPartner(partner);
        //sout
        System.out.println(person.getPartner().getName());

        System.out.println("\nChildren of partner " + partner.getName() + ":");
        person.addChildrenToPartner(person);
        for (int i = 0; i < partner.getChildren().size(); i++) {
            System.out.println(partner.getChildren().get(i).getName());
        }

        System.out.println("\nGrandchildren of partner " + partner.getName() + ":");
        person.addGrandChildrenToPartner(person);
        for (int i = 0; i < partner.getGrandChildren().size(); i++) {
            System.out.println(partner.getGrandChildren().get(i).getName());
        }

        System.out.println("\nBrothers and sisters in law of " + partner.getName() + ":");
        person.addSiblingsToPartner(person);
        for (int i = 0; i < partner.getSiblings().size(); i++) {
            System.out.println(partner.getSiblings().get(i).getName());
        }
    }
}

