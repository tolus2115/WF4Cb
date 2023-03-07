package pdf4;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz łancuch znaków");
        String lancuch = klawiatura.nextLine();
        System.out.println("Wprowadz znak który chcesz policzyc ");
        char znak =  klawiatura.nextLine().charAt(0);
        int licz = 0;

        for(int i=0; i<lancuch.length();i++){
            if(lancuch.charAt(i) == znak){
                licz++;
            }
        }
        System.out.println("Lizcba wystapien twojego znaku  w łancuchu znaków to: " + licz);
    }
}
