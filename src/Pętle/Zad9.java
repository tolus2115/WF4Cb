package Pętle;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int suma;
        String odp;
        do{
            int liczba1;
                    int liczba2;
                    System.out.println("Wprowadz pierwsza liczbe:");
                    liczba1= klawiatura.nextInt();
                    System.out.println("Wprowadz druga liczbe:");
                    liczba2 = klawiatura.nextInt();

                    suma= liczba1 + liczba2;
                    System.out.println("suma wynosi: " +suma);
                    System.out.println("Czy chesz konytnuowac ");
                    odp = klawiatura.nextLine();
                    odp = klawiatura.nextLine();
        }while (!odp.equalsIgnoreCase("nie"));
        {
            System.out.println("Koniec");
        }
    }
}
