import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwe ulubionego miasta: ");
        String miasto = klawiatura.nextLine();

        int liczbaznakow = miasto.length();
        String wielkielitery = miasto.toUpperCase();
        String malelitery = miasto.toLowerCase();
        char pierwszyznak = miasto.charAt(0);

        System.out.println(
                "Liczba znaków w nazwie miasta: " + liczbaznakow + "\n" +
                        "Nazwa miasta zapisana wielkimi literami :" + wielkielitery + "\n" +
                        "Nazwa miasta zapisana malymi literami :" + malelitery + "\n" +
                        "Pierwszy znak nazwy miasta: " + pierwszyznak);
    }
}
