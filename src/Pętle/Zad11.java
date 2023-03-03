package Pętle;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Wporwadz liczbe " + i);
            int liczby = klawiatura.nextInt();
            suma += liczby;
        }
        System.out.println("Suma wprowadzonych liczb wynosi: " + suma);
    }
}
