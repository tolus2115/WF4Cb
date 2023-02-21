import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz cene posiłku: ");
        double cenaposilku = klawiatura.nextDouble();

        double podatek = 0.0675;
        double cenapodatku = cenaposilku*podatek;
        double napiwek = 0.2;
        double cenanapiwku = (cenaposilku+cenapodatku)*napiwek;

        double lacznakwota = cenaposilku + cenapodatku +cenanapiwku;

        System.out.println(
                "Cena posilku wynosi: " + cenaposilku + "\n" +
                        "Cena podatku wynosi: " + cenapodatku + "\n" +
                        "Laczna kwota wynosi: " + lacznakwota + "\n");
    }
}
