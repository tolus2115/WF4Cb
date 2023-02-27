package podstawy;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj długosc pomieszczenia pierwszego: ");
        int dlugosc1 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pomieszczenia pierwszego: ");
        int szerokosc1 = klawiatura.nextInt();
        System.out.println("Podaj długosc pomieszczenia drugiego: ");
        int dlugosc2 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pomieszczenia drugiego: ");
        int szerokosc2 = klawiatura.nextInt();
        System.out.println("Podaj długosc pomieszczenia trzeciego: ");
        int dlugosc3 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pomieszczenia trzeciego: ");
        int szerokosc3 = klawiatura.nextInt();
        System.out.println("Podaj długosc pomieszczenia czwartego: ");
        int dlugosc4 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pomieszczenia czwartego: ");
        int szerokosc4 = klawiatura.nextInt();




        int pomieszzcenie1 = dlugosc1*szerokosc1;
        int pomieszczenie2 = dlugosc2*szerokosc2;
        int pomieszczenie3 = dlugosc3*szerokosc3;
        int pomieszczenie4 = dlugosc4*szerokosc4;

        int powierzchniacalkowita = pomieszzcenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        System.out.println("Powierzchnia pomieszczenia pierwszego: " + pomieszzcenie1);
        System.out.println("Powierzchnia pomieszczenia drugiego: " + pomieszczenie2);
        System.out.println("Powierzchnia pomieszczenia trzeciego: " + pomieszczenie3);
        System.out.println("Powierzchnia pomieszczenia czwartego: " + pomieszczenie4);
        System.out.println("Powierzchnia calkowita mieszkania: " + powierzchniacalkowita);

        double liczbaosob = 4;
        double powierzchnianaosobe = powierzchniacalkowita / liczbaosob;
        System.out.println("Powierzchnia na jedna  osobe:" + powierzchnianaosobe);

    }
}
