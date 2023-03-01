package warunki;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz liczbe kalori:");
        double liczbakalori = klawiatura.nextDouble();
        System.out.println("Wprowadz ilosc gramów tłuszczu");
        double liczbagramowtluczu = klawiatura.nextDouble();
        double kalorieztluszczu = liczbagramowtluczu * 9;

        if(kalorieztluszczu>liczbakalori) {
            System.out.println("Podane dane sa nie prawidłowe");
        }
        double procenttluszczu = kalorieztluszczu/liczbakalori;
        if(procenttluszczu < 0.3){
            System.out.println("Produnkt jest niskotłuszczowy");
        } else {
            System.out.println("Produkt ma: " + procenttluszczu + " tłuszczu");
        }

    }
}
