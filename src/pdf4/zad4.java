package pdf4;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj czas pracy");
        int czas = klawiatura.nextInt();
        if(czas<=0){
            System.out.println("Wpisz poprawne dane ");
            return;
        }
        double suma = 0;
        double suma1 = 0;
        double pensja =0.01;
        for (int i = 1; i <=2; i++){
            double hajs = pensja * i;
            System.out.println("Dziis  zarobiłes " + hajs );
            suma += hajs;
        }
        for(int i =3; i<=czas; i++){

        }
    }
}
