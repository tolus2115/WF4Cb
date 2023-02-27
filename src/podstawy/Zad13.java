package podstawy;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int kaloriejednegoCiasteczka = 300/4;
                System.out.println("Podaj liczbe zjedzonych ciasteczek:");;
                int liczbaZjedzonychciasteczek = klawiatura.nextInt();
                int liczba_kalori = kaloriejednegoCiasteczka*liczbaZjedzonychciasteczek;
                System.out.println("Liczba zjedonych kalorii po zjedzeniu "+liczbaZjedzonychciasteczek+" Wynosi: "+liczba_kalori);
    }
}
