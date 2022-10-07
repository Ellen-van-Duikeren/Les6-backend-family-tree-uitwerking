import java.util.Arrays;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        //arrange
        Person person = new Person("John", "Doe", "M", 81); //person
        Person child = new Person("Janie", "Doe", "F", 52); //child
        Person grandChild1 = new Person("Richard", "Doe", "F", 21);  //grandchild
        Person grandChild2 = new Person("Janie jr", "Doe", "F", 20); // grandchild
        //act
        person.addChild(child);
        person.addGrandChildren(grandChild1);
        person.addGrandChildren(grandChild2);

        //souts
        System.out.println("Head of the family:");
        System.out.println(person.getName() + " " + person.getLastName() + ", sex: " + person.getSex() + ", " + person.getAge() + " years old.");

        System.out.println("\nChild:");
        System.out.println(person.getChildren().get(0).getName() + " " + person.getChildren().get(0).getLastName() + ", sex: " + person.getChildren().get(0).getSex() + ", " + person.getChildren().get(0).getAge() + " years old.");

        System.out.println("\nGrandchildren:");
        for (int i = 0; i < person.getGrandChildren().size(); i++) {
            System.out.println(person.getGrandChildren().get(i).getName() + " " + person.getGrandChildren().get(i).getLastName() + ", sex: " + person.getGrandChildren().get(i).getSex() + ", " + person.getGrandChildren().get(i).getAge() + " years old.");
        }

        //bonusexercise 1
        //arrange
        Pet pet1 = new Pet("Wooof", 2, "cavia");
        Pet pet2 = new Pet("Boooo", 3, "cavia");
        //act
        grandChild1.addPet(pet1);
        grandChild2.addPet(pet2);
        //sout
        System.out.println("\nPets of the grandchildren of " + person.getName() + ":");
        person.getPetsFromGrandChildren(person);

        //bonusexercise 2
        //arrange
        System.out.println("\nNieces of " + person.getName() + ":");
        Person olivia = new Person("Olivia", "Doe", "F", 86);
        Person emma = new Person("Emma", "Doe", "F", 56);
        Person charlotte = new Person("Charlotte", "Doe", "F", 56);
        Person liam = new Person("Liam", "Doe", "M", 52);
        //act
        olivia.addChild(emma);
        olivia.addChild(charlotte);
        olivia.addChild(liam);
        person.addSibling(olivia);
        //sout
        for (int i = 0; i < person.getNiecesFromPerson(person).size(); i++) {
            System.out.println(person.getNiecesFromPerson(person).get(i).getName());
        }

        //bonusexercise 3
        System.out.println("\nPartner of " + person.getName() + ":");
        //arrange
        Person jane = new Person("Jane", "Doe", "F", 77);
        //act
        person.addPartner(jane);
        //sout
        System.out.println(person.getPartner().getName());
    }
}

