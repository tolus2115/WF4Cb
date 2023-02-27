package warunki;
import java.util.Scanner;
public class zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wage przesylki:");
        double waga = klawiatura.nextDouble();
        System.out.println("Podaj odleglosc przesylki: ");
        int odleglosc = klawiatura.nextInt();

        if(odleglosc > 500) {
            odleglosc = 2;

        }
        else{
            odleglosc = 1;
        }


        if(waga<=1){
            double koszt = odleglosc * 1.10;
            System.out.println("Koszt przesylki wynosi: "+koszt);
        }
        else if(waga>1 && waga <= 3){
            double koszt = odleglosc * 2.20;
            System.out.println("Koszt przesylki wynosi: "+koszt);
        }
        else if (waga>3 && waga <= 5) {
            double koszt = odleglosc * 3.70;
            System.out.println("Koszt przesylki wynosi: "+koszt);
        }
        else if(waga>5){
            double koszt = odleglosc * 3.80;
            System.out.println("Koszt przesylki wynosi: "+koszt);
        }
    }


}
