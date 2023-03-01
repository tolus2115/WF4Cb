import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwisko pierwsza zawodnika");
        String nazwisko1 = klawiatura.nextLine();
        System.out.println("Podaj nazwisko drugiego zawodnika");
        String nazwisko2 = klawiatura.nextLine();
        System.out.println("Podaj nazwisko trzecfiego zawdonika");
        String nazwisko3 = klawiatura.nextLine();

        double czas1, czas2, czas3;
        System.out.println("Podaj czas dotarcia pierwszego zawodnika na mete");
        czas1 = klawiatura.nextDouble();
        System.out.println("Podaj czas dotarcia drugiego zawodnik na mete");
        czas2 = klawiatura.nextDouble();
        System.out.println("Podaj czas dotarcia trzeciego zawodnik na mete");
        czas3 = klawiatura.nextDouble();

        if(czas1<czas2 && czas1<czas3){
         System.out.println("Miejsce pierwsze:"+nazwisko1);
         if(czas2<czas3){
             System.out.println("Miejsce drugie:" + nazwisko2);
             System.out.println("Miejsce trzecie:" + nazwisko3);
         }
         else if(czas3<czas2){
             System.out.println("Miejsce drugie:" + nazwisko3);
             System.out.println("Miejsce trzecie:" + nazwisko2);
         }
        }
        else if(czas2<czas1 && czas2<czas3){
            System.out.println("Miejsce pierwsze:"+nazwisko2);
            if(czas1<czas3){
                System.out.println("Miejsce drugie:" + nazwisko1);
                System.out.println("Miejsce trzecie:" + nazwisko3);
            }
            else if(czas3<czas1){
                System.out.println("Miejsce drugie:" + nazwisko3);
                System.out.println("Miejsce trzecie:" + nazwisko1);
            }
        } else if (czas3 < czas1 && czas3 < czas2) {
            System.out.println("Miejsce pierwsze:"+nazwisko3);
            if(czas1<czas2){
                System.out.println("Miejsce drugie:" + nazwisko1);
                System.out.println("Miejsce trzecie:" + nazwisko2);
            }
            else if(czas2<czas1){
                System.out.println("Miejsce drugie:" + nazwisko2);
                System.out.println("Miejsce trzecie:" + nazwisko1);
            }
        }

    }
}
