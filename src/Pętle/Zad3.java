package Pętle;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        String litera;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz jedna z wybranych słów  (Tak lub Nie)  ");
        litera = klawiatura.nextLine();

        while( !litera.equalsIgnoreCase("Tak" ) && !litera.equalsIgnoreCase("Nie")){
            System.out.println("Prosze przeczytac jeszcze raz polecenie!!!!!!!!");;
            litera = klawiatura.nextLine();
        }
        System.out.println("Gratuluje wprowadziłes poprawne dane :)");
    }
}
