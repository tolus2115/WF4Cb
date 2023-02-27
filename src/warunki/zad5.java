package warunki;
import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj mase obiektu: ");
        int masa = klawiatura.nextInt();

        double ciezar = masa * 9.8;

        if(ciezar > 1000){
            System.out.println("Obiekt jest zbyt ciezki!");
        }
        else if(ciezar < 10){
            System.out.println("Obiekt jest za lekki!");
        }
        else{
            System.out.println("Obiekt ma odpowiedni ciezar ");
        }
    }

}
