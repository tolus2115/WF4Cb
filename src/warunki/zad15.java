package warunki;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner klawaitura = new Scanner(System.in);
        int oplatapodstawowa = 10;
        int liczbaczekow;
        double koncowakwota;
        System.out.println("Wprowadz liczbe wystawionych czeków: ");
        liczbaczekow = klawaitura.nextInt();
        if(liczbaczekow<20){
   koncowakwota = oplatapodstawowa*(liczbaczekow*0.1);
   System.out.println("Opłaty pobrane przez bank w tym miesiacu :" + koncowakwota);
        }
        if(liczbaczekow>=20 && liczbaczekow<=39){
            koncowakwota = oplatapodstawowa*(liczbaczekow*0.08);
            System.out.println("Opłaty pobrane przez bank w tym miesiacu :" + koncowakwota);
        }
        if(liczbaczekow>=40 && liczbaczekow<=59){
            koncowakwota = oplatapodstawowa*(liczbaczekow*0.06);
            System.out.println("Opłaty pobrane przez bank w tym miesiacu :" + koncowakwota);
        }
        if(liczbaczekow>60){
            koncowakwota = oplatapodstawowa*(liczbaczekow*0.04);
            System.out.println("Opłaty pobrane przez bank w tym miesiacu :" + koncowakwota);
        }
    }
}
