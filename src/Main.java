import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Studerende std1 = new Studerende();
        std1.navn = "Leila";
        std1.alder = 49;
        std1.by = "Næstved";

        Studerende std2 = new Studerende("Jenna", 36, "Nørre Alslev");


        Studerende std3 = new Studerende("Malte", 28);

        Studerende std4 = new Studerende();
        std4.navn = "Sara";
        std4.alder = 27;
        std4.by = "Næstved";

        Studerende std5 = new Studerende();
        std5.navn = "Louise";
        std5.alder = 41;
        std5.by = "Glumsø";

        while (true) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write the name of the student you wish to find data on: ");
        String nameToFind = input.next();



            switch (nameToFind) {
                case "Leila":
                    System.out.println(std1.alder);
                    break;
                case "Jenna":
                    System.out.println(std2.alder);
                    break;
                case "Malte":
                    System.out.println(std3.alder);
                    break;
                case "Sara":
                    System.out.println(std4.alder);
                    break;
                case "Louise":
                    System.out.println(std5.alder);
                    break;
                default:
                    System.out.println("Student is not available");

            }
        }
    }
}
