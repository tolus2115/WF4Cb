public class Zad18 {
    public static void main(String[] args) {
        double iloscakcji = 600;
        double cenaakcji = 21.77;
        double prowizja = 0.02;

        double kwotabezprowizji = iloscakcji*cenaakcji;
        double kwotaprowizji = kwotabezprowizji*prowizja;
        double lacznakwota = kwotabezprowizji*kwotaprowizji;

        System.out.println("Kwota zapłacona za akcje bez prowizji: " + kwotabezprowizji);
        System.out.println("wysokosc prowizji: " + kwotaprowizji);
        System.out.println("Laczna kwota: " + lacznakwota);
    }
}
