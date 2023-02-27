package warunki;
import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wynik z 1 testu:");
        int wynik1 = klawiatura.nextInt();
        System.out.println("Podaj wynik z 2 testu:");
        int wynik2 = klawiatura.nextInt();
        System.out.println("Podaj wynik z 3 testu:");
        int wynik3 = klawiatura.nextInt();

        double srednia = (wynik1 + wynik2 + wynik3)/3;

        if(srednia >= 90){
            System.out.println("Twoja ocena to 5, srednia: "+srednia);
        }
        else if(srednia >= 80 && srednia < 90){
            System.out.println("Twoja ocena to 4, srednia: "+srednia);
        }
        else if(srednia >= 70 && srednia < 80){
            System.out.println("Twoja ocena to 3, srednia: "+srednia);
        }
        else if(srednia >= 60 && srednia < 70){
            System.out.println("Twoja ocena to 2, srednia: "+srednia);
        }
        else if(srednia < 60){
            System.out.println("Twoja ocena to 1, srednia: "+srednia);
        }


    }





}
