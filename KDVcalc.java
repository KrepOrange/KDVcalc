import java.util.Scanner;

public class KDVcalc {
    public static void main(String[] args) {
        //variable
        double kdvsiz, kdvTutar;
        Scanner fiyat = new Scanner(System.in);

            System.out.print("KDV tutarını ve KDV'li fiyatını bilmek istediğiniz ücreti giriniz: ");
            kdvsiz = fiyat.nextDouble();
            if (kdvsiz < 1000)
                kdvTutar = (kdvsiz * 18) / 100;
            else
                kdvTutar = (kdvsiz * 8) / 100;
            System.out.println("KDV'siz Fiyat = " + kdvsiz);
            System.out.println("KDV Tutarı = " + kdvTutar);
            System.out.println("KDV'li Fiyat = " + (kdvsiz + kdvTutar));
    }
}
