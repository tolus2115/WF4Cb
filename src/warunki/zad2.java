package warunki;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj dzien: ");
        int dzien = klawiatura.nextInt();
        System.out.println("Podaj miesiac: ");
        int miesiac = klawiatura.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = klawiatura.nextInt();

        int magic = (dzien * miesiac) ;

        if(magic == rok){
            System.out.println("Rok jest magiczny");
        }
        else{
            System.out.println("Rok nie jest magiczny");
        }
    }
}
