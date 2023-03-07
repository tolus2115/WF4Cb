package pdf4;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj dodatnia liczbe niezerowa całkowitą ");
        int liczba = klawiatura.nextInt();
        int suma = 0;

        for(int i =1; i<=liczba; i++){
            suma += i;
        }
        System.out.println("Suma liczb od 1 do "+liczba+" Wynosi: " +suma);
    }
}
