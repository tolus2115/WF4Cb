package pdf4;

import java.util.Random;
import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        Random rand = new Random();
        int liczba= rand.nextInt(77)+1;
        int zgadnij;
        do{
            System.out.println("Odgadnij liczbe");
            zgadnij = klawiatura.nextInt();
            if(zgadnij > liczba){
                System.out.println("Liczba jest za duza spróboj ponownie :(");
            } else if(zgadnij < liczba){
             System.out.println("Liczba jest za mała spróbuj ponownie :(");
            }
        } while(zgadnij != liczba);
        System.out.println("Gratulacje zgadles liczbe!");
    }
}
