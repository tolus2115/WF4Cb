package Pętle;

public class Zad12 {
    public static void main(String[] args) {
        double suma = 0;
        for(double i=1, j=30; i<=30;i++,j--){
            suma += i/j;
            System.out.println(i+" /"+j+"");
        }
        System.out.println("Suma ciągu liczb"+suma);
    }
}
