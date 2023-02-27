package warunki;
import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę skeund:");
        int podanaLiczbaSekund = klawiatura.nextInt();
        int liczbaSekund = 0;
        int liczbaMinut = 0;
        int liczbaGodzin = 0;
        int liczbaDni = 0;

        if (podanaLiczbaSekund < 60 && podanaLiczbaSekund >= 0) {
            System.out.println(podanaLiczbaSekund + " sekund to " + podanaLiczbaSekund + " sekund.");
        } else if (podanaLiczbaSekund < 3600) {
            liczbaMinut = podanaLiczbaSekund / 60;
            liczbaSekund = podanaLiczbaSekund % 60;
            System.out.println(podanaLiczbaSekund + " sekund to " + liczbaMinut + " minut, " + liczbaSekund + "sekund.");
        } else if (podanaLiczbaSekund < 86400) {
            liczbaGodzin = podanaLiczbaSekund / 3600;
            liczbaMinut = (podanaLiczbaSekund % 3600) / 60;
            liczbaSekund = podanaLiczbaSekund % 60;
            System.out.println(podanaLiczbaSekund + " sekund to " + liczbaGodzin + " godzin, " + liczbaMinut + " minut, " + liczbaSekund + "sekund.");
        } else if (podanaLiczbaSekund >= 86400) {
            liczbaDni = podanaLiczbaSekund / 86400;
            liczbaGodzin = (podanaLiczbaSekund % 86400) / 3600;
            liczbaMinut = (podanaLiczbaSekund % 3600) / 60;
            liczbaSekund = podanaLiczbaSekund % 60;
            System.out.println(podanaLiczbaSekund + " sekund to " + liczbaDni + " dni, " + liczbaGodzin + " godzin, " + liczbaMinut + " minut, " + liczbaSekund + "sekund.");
        } else {
            System.out.println("Podałeś złą liczbę!");
        }
    }
}