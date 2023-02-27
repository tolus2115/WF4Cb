package warunki;
import java.util.Scanner;
public class zad7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String imie1 = klawiatura.nextLine();
        String imie2 = klawiatura.nextLine();
        String imie3 = klawiatura.nextLine();

        if (imie1.compareTo(imie2) <= 0 && imie1.compareTo(imie3) <= 0){
            if (imie2.compareTo((imie3)) <= 0){
                System.out.println(imie1);
                System.out.println(imie2);
                System.out.println(imie3);
            } else {
                System.out.println(imie1);
                System.out.println(imie3);
                System.out.println(imie2);
            }
        } else if (imie2.compareTo(imie1) <= 0 && imie2.compareTo(imie3) < 0) {
            if (imie1.compareTo((imie3)) <= 0){
                System.out.println(imie2);
                System.out.println(imie1);
                System.out.println(imie3);
            } else {
                System.out.println(imie2);
                System.out.println(imie3);
                System.out.println(imie1);
            }
        } else if (imie3.compareTo(imie1) <= 0 && imie3.compareTo(imie2) <= 0) {
            if (imie1.compareTo((imie2)) <= 0){
                System.out.println(imie3);
                System.out.println(imie1);
                System.out.println(imie2);
            } else {
                System.out.println(imie3);
                System.out.println(imie2);
                System.out.println(imie1);
            }
        } else {
            System.out.println("Podałeś złe dane!");
        }
    }

}
