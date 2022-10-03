import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        Person panc = new Person("Panc", "van", "Duikeren", "M", 81); //person
        Person ellen = new Person("Ellen", "van", "Duikeren", "F", 52); //child
        Person emily = new Person("Emily", "van der", "Hidde", "F", 21);  //grandchild
        Person nica = new Person("Nica", "van der", "Hidde", "F", 20); // grandchild
        Pet kuifje = new Pet("Kuifje", 2, "cavia");
        Pet haagh = new Pet("Haagh", 3, "cavia");

        panc.addChild(ellen);
        panc.addGrandChildren(emily);
        panc.addGrandChildren(nica);
        emily.addPet(kuifje);
        nica.addPet(haagh);

        System.out.println("Head of the family:");
        System.out.println(panc.getName() + " " + panc.getMiddleName() + " " + panc.getLastName() + ", sex: " + panc.getSex() + ", " + panc.getAge() + " years old.");

        System.out.println("\nChild:");
        System.out.println(panc.getChildren().get(0).getName() + " " + panc.getChildren().get(0).getMiddleName() + " " + panc.getChildren().get(0).getLastName() + ", sex: " + panc.getChildren().get(0).getSex() + ", " + panc.getChildren().get(0).getAge() + " years old.");



        System.out.println("\nGrandchildren:");
        for (int i = 0; i < panc.getGrandChildren().size(); i++) {
            System.out.println(panc.getGrandChildren().get(i).getName() + " " + panc.getGrandChildren().get(i).getMiddleName() + " " + panc.getGrandChildren().get(i).getLastName() + ", sex: " + panc.getGrandChildren().get(i).getSex() + ", " + panc.getGrandChildren().get(i).getAge() + " years old.");
        }

        System.out.println("\nPets of the grandchildren:");
        System.out.println("Emily's pet: " + emily.getPets().get(0).getName());
        System.out.println("Nica's pet: " + nica.getPets().get(0).getName());

        panc.getPetsFromGrandChildren(panc);
        for (int i = 0; i < panc.getGrandChildren().size(); i++) {
            System.out.println(panc.getPetsFromGrandChildren(panc).get(i));
        }
    }
}
