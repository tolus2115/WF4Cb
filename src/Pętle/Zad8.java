package Pętle;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczba;
        int produkt = 0;
        while(produkt<100){
            System.out.println("Wprowadz liczbe:");
            liczba = klawiatura.nextInt();
            produkt = liczba*10;
            System.out.println("Wynik mnozenia przez 10: " + produkt);
        }
        System.out.println("Wartość zmiennej produkt jest wieksza niż 100");
    }
}
