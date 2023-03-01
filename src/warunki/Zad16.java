package warunki;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int sprzedaneksiazki;
        double zdobytepunkty;
        System.out.println("Wprowadz ile ksiazek zostało sprzedanych: ");
        sprzedaneksiazki = klawiatura.nextInt();

        if(sprzedaneksiazki==0){
            System.out.println("Gratulacje, ottrzymałes 0 punktów");
        }
        if(sprzedaneksiazki==1){
            System.out.println("Gratulacje, ottrzymałes 5 punktów");
        }
        if(sprzedaneksiazki==2){
            System.out.println("Gratulacje, ottrzymałes 15 punktów");
        }
        if(sprzedaneksiazki==3){
            System.out.println("Gratulacje, ottrzymałes 30 punktów");
        }
        if(sprzedaneksiazki==4){
            System.out.println("Gratulacje, ottrzymałes 60 punktów");
        }
        else{
            System.out.println("Maksymalna ilosc sprzedanych  ksiazek w miesiacu wynosi: 4");
        }
    }
}
