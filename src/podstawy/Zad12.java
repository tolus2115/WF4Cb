package podstawy;

import java.util.Scanner;
public class Zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę przejechanych kilometrów:");
        int przejechaneKilometry = klawiatura.nextInt();
        System.out.println("Podaj liczbę zużytych litrów paliwa:");
        int zuzyteLitry = klawiatura.nextInt();

        int kilometryNaLitr = przejechaneKilometry / zuzyteLitry;
        System.out.println("Na jednym litrze przejechałeś: " + kilometryNaLitr + " kilometrów!");

    }
}
