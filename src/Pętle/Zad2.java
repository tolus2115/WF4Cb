package Pętle;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        String litera;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz jedna z wybranych liter  (T, t, N, n)  ");
        litera = klawiatura.nextLine();

        while( !litera.equalsIgnoreCase("t" ) && !litera.equalsIgnoreCase("n")){
            System.out.println("Prosze przeczytac jeszcze raz polecenie!!!!!!!!");;
            litera = klawiatura.nextLine();
        }
        System.out.println("Gratuluje wprowadziłes poprawne dane :)");
    }
}


