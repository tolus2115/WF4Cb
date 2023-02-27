package warunki;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj swoja wage:");
        double waga = klawiatura.nextDouble();
        System.out.println("Podaj swoj wzrost:");
        double wzrost = klawiatura.nextDouble();
        wzrost= wzrost * 0.01;

        double bmi = waga/(wzrost*wzrost);

        if(bmi < 18.5){
            System.out.println("Masz niedowage, bmi: "+bmi);
        }
        else if(bmi > 25){
            System.out.println("Masz nadwage, bmi: "+bmi);
        }
        else{
            System.out.println("Twoja waga jest optymalna, bmi: "+bmi);
        }

    }
}
