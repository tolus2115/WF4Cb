package podstawy;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna plytki:");
        double cenadetaliczna = klawiatura.nextDouble();
        double marza = 0.4;

        double zysk = cenadetaliczna*marza;
        System.out.println("Zysk na sprzedazy takiej plytki z marza 40% wynosi: " + zysk);
    }
}
