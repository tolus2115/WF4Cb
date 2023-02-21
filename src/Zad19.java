public class Zad19 {
    public static void main(String[] args) {
        double iloscKonsumentow = 12467;
        double przynajmniejJeden = 0.14;
        double smakCytrusowy = 0.64;

        double iloscPrzynajmniejJedenD = iloscKonsumentow * przynajmniejJeden;
        double iloscSmakCytrusowyD = iloscKonsumentow * smakCytrusowy;

        int iloscPrzynajmniejJeden = (int)iloscPrzynajmniejJedenD;
        int iloscSmakCytrusowy = (int)iloscSmakCytrusowyD;

        System.out.println("Przybliżona liczba ankietowanych, która kupuje przynajmniej raz w tygodniu wynosi: " + iloscPrzynajmniejJeden);
        System.out.println("Przybliżona liczba ankietowanych, która preferuje smak cytrusowy: " + iloscSmakCytrusowy);

    }
}
