package warunki;
import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {


    Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadz liczbe kalorii:");
    double liczbaKalorii = klawiatura.nextDouble();
        System.out.println("Wprowadz liczbe gramów tłuszczu:");
    double liczbaGramowTluszczu = klawiatura.nextDouble();

    double kalorieZTluszczu = liczbaGramowTluszczu * 9;

        if(kalorieZTluszczu >liczbaKalorii)

    {
        System.out.println("Dane wejściowe są nieprawdiłowe!");
    }

    double procentKalorii = kalorieZTluszczu / liczbaKalorii;

        if(procentKalorii< 0.30)

    {
        System.out.println("Produkt jest niskotłuszczowy!");
    } else

    {
        System.out.println("Produkt ma " + procentKalorii + " tłuszczu.");
    }
}
}
