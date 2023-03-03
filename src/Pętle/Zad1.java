package Pętle;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz liczbe od 10 do 24");
        int numer = klawiatura.nextInt();

        while(numer < 10 || numer > 24){
            System.out.println("Prosze przeczytac jeszcze raz polecenie!!!!!!!!");;
            numer = klawiatura.nextInt();
        }
        System.out.println("Gratuluje wprowadziłes poprawne dane :)");
    }
}
