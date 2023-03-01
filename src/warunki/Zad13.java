package warunki;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String wybor;
        double cenaA = 39.99;
        double cenaB =  59.99;
        double cenaC = 69.99;
        double liczbaminut;
        double lacznacena;
        double darmoweA = 450;
        double darmoweB = 900;
        System.out.println("Wybierz pakiet A,B,C ");
        wybor = klawiatura.nextLine();
        System.out.println("Wprowadz liczbe minut rozmów");
        liczbaminut = klawiatura.nextDouble();

        switch (wybor){
            case "A":
                if(liczbaminut<darmoweA) {
                    lacznacena = cenaA;
                }
                else {
                    lacznacena = cenaA+(liczbaminut-darmoweA)*0.45;
                }
                System.out.println("łączne opłaty za mieisac: " + lacznacena);

            break;
            case "B":
                    if(liczbaminut<darmoweA){
                        lacznacena = cenaB;
                    }
                    else {
                        lacznacena = cenaB+(liczbaminut-darmoweA)*0.4;
                    }
                    System.out.println("łączne opłaty za mieisac: " + lacznacena);

                break;
            case "C":
                lacznacena = cenaC;
                System.out.println("łączne opłaty za mieisac: " + lacznacena);

            break;
            default:
                System.out.println("Nie ma takiego wyboru");
        }

    }
}
