import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartosc kupowanego produktu:");
        int wartosc = klawiatura.nextInt();

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;
        double stanowy = wartosc*podatekStanowy;
        double lokalny = wartosc*podatekLokalny;
        double wartoscCalkowita = wartosc+stanowy+lokalny;

        System.out.println("Wartosc produktu: "+wartosc+" Podatek stanowy "+stanowy+" Podatek lokalny "+lokalny+" Wartosc calkowita: "+wartoscCalkowita);
    }
}
