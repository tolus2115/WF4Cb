package podstawy;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String pierwszeimie, drugieimie, nazwisko;
        System.out.println("Podaj swoje pierwsze imie");
        pierwszeimie = klawiatura.nextLine();
        System.out.println("Podaj swoje drugie imię");
        drugieimie = klawiatura.nextLine();
        System.out.println("Podaj swoje nazwisko");
        nazwisko = klawiatura.nextLine();
        char PierwszyInitial = pierwszeimie.charAt(0);
        char DrugiInitial = drugieimie.charAt(0);
        char nazwiskoInitial = nazwisko.charAt(0);
        System.out.print("Twoje inicjaly to: " + PierwszyInitial + DrugiInitial + nazwiskoInitial );
    }
}
