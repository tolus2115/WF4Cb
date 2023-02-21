import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner klawaitura = new Scanner(System.in);
        System.out.println("Podaj ocene z pierwszego testu: ");
        double ocena1 = klawaitura.nextInt();
        System.out.println("Podaj ocenez drugiego testu: ");
        double ocena2 = klawaitura.nextInt();
        System.out.println("Podaj ocene z trzeceigo testu: ");
        double ocena3 = klawaitura.nextInt();
        double srednia = (ocena1 + ocena2 + ocena3) / 3;

        System.out.println("Ocena z pierwszego testu to: "+ ocena1);
        System.out.println("Ocena z drugiego testu to: "+ ocena2);
        System.out.println("Ocena z trzeciego testu to: "+ ocena3);
        System.out.println("Srednia wynosi: " +srednia);
    }
}
