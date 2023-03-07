package pdf4;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz szybkość pojazdu (w km na godzine):");
        int szybkosc = klawiatura.nextInt();
        System.out.println("Wprowadz godzin podróży:");
        int godziny = klawiatura.nextInt();
        int odleglosc = 0;

        System.out.println("Godzina:  Przebyta odległosc:");
        for(int i =1;i <= godziny ;i++){
            odleglosc += szybkosc;
            System.out.println(i+" "+odleglosc);
        }

    }
}
