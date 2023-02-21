import java.util.Scanner;
public class zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double cukier = 1.5 / 48;
        double maslo = 1.0 / 48;
        double maka = 2.75 / 48;

        System.out.println("Podaj liczbę ciastek: ");
        double liczbaCiastek = klawiatura.nextDouble();

        double cukierO = liczbaCiastek * cukier;
        double masloO = liczbaCiastek * maslo;
        double makaO = liczbaCiastek * maka;

        System.out.printf("Do przygotowania takiej ilości ciastek potrzeba:");
        System.out.printf("\nszklanek cukru:%.2f ", cukierO);
        System.out.printf("\nszklanek masła:%.2f ", masloO);
        System.out.printf("\nszklanek mąki:%.2f ", makaO);
    }
}
