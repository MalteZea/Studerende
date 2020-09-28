import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Studerende std1 = new Studerende();
        std1.navn = "Leila";
        std1.alder = 49;
        std1.by = "Næstved";

        Studerende std2 = new Studerende();
        std2.navn = "Jenna";
        std2.alder = 36;
        std2.by = "Nørre Alslev";

        Studerende std3 = new Studerende();
        std3.navn = "Malte";
        std3.alder = 28;
        std3.by = "Nykøbing F";

        Studerende std4 = new Studerende();
        std4.navn = "Sara";
        std4.alder = 27;
        std4.by = "Næstved";

        Studerende std5 = new Studerende();
        std5.navn = "Louise";
        std5.alder = 42;
        std5.by = "Næstved";

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

        }

    }
}
