package warunki;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String wybor;
        double cenaA = 39.99;
        double cenaB =  59.99;
        double cenaC = 69.99;
        double liczbaminut;
        double lacznacenaA;
        double lacznacenaB;
        double lacznacenaC;
        double darmoweA = 450;
        double darmoweB = 900;

        double zaoszczedzone;
        System.out.println("Wybierz pakiet A,B,C ");
        wybor = klawiatura.nextLine();
        System.out.println("Wprowadz liczbe minut rozmów");
        liczbaminut = klawiatura.nextDouble();

        switch (wybor){
            case "A":
                if(liczbaminut<darmoweA) {
                    lacznacenaA = cenaA;
                }
                else {
                    lacznacenaA = cenaA+(liczbaminut-darmoweA)*0.45;
                }
              if(liczbaminut<darmoweB){
                  lacznacenaB = cenaB;
              }
              else{
                  lacznacenaB = cenaB+(liczbaminut-darmoweB)*0.4;
              }
              zaoszczedzone=lacznacenaA-lacznacenaB;
              lacznacenaC = cenaC;
              if(zaoszczedzone>0){
                  System.out.println("Jesli wybierasz pakiet B to zaoszczedzisz: "+zaoszczedzone);
                  zaoszczedzone=lacznacenaA-lacznacenaC;
                  if (zaoszczedzone>0){
                      System.out.println("Jesli wybierasz pakiet C to zaoszczedzisz: "+zaoszczedzone);
                  }
              }
              System.out.println("Łączne opłaty za mieisac: " + lacznacenaA);
                break;
            case "B":
                if(liczbaminut<darmoweB){
                    lacznacenaB = cenaB;
                }
                else {
                    lacznacenaB = cenaB+(liczbaminut-darmoweB)*0.4;
                }
                lacznacenaC = cenaC;
                zaoszczedzone = lacznacenaB - lacznacenaC;
                if(zaoszczedzone>0){
                    System.out.println("Jesli wybierzesz pakiet C zaoszczedzisz: " +zaoszczedzone);
                }
                System.out.println("Łączne oplaty za miesiac:" + lacznacenaB);


                break;
            case "C":
                lacznacenaC = cenaC;
                System.out.println("łączne opłaty za mieisac: " + lacznacenaC);
                break;
            default:
                System.out.println("Nie ma takiego wyboru");
        }
    }
}

