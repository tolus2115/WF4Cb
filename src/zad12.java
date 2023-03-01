import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiautra = new Scanner(System.in);
        String wybor;
        double odleglosc;
        double czas;
        System.out.println("Wprowadz jedno z podanych słów: powietrze, woda, stal");
        wybor = klawiautra.nextLine();
        System.out.println("Wporwadz odległosc jaka przybc ma fala dzwiekowa");
        odleglosc = klawiautra.nextDouble();


        switch (wybor) {
            case "powietrze":
                czas = odleglosc / 343;
                System.out.println("Czas potrzebny na pokonanie dustansu w powietrzu: " + czas);

        break;
            case "woda":
                czas = odleglosc / 1490;
                System.out.println("Czas potrzebny na pokonanie dustansu  w wodzie: " + czas);

            break;
            case "stal":
                czas = odleglosc / 5100;
                System.out.println("Czas potrzebny na pokonanie dustansu  w stali: " + czas);

            break;
            default:
                System.out.println("Prosze podac słowo z wybranych mozliwosci:");
            break;
            }

    }
    }

