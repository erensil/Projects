package java101;
import java.util.Scanner;

public class Manav_Kasa_Programi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double elmaKilo,armutKilo,domatesKilo,muzKilo,patlicanKilo,armutTutar,elmaTutar,domatesTutar,muzTutar,patlicanTutar,toplamTutar;
        System.out.print("Kac Kilo Elma Almak Istiyorsunuz:");
        elmaKilo = input.nextDouble();
        elmaTutar = elmaKilo * 3.67;
        System.out.print("Kac Kilo Armut Almak Istiyorsunuz:");
        armutKilo = input.nextDouble();
        armutTutar = armutKilo * 2.14;
        System.out.print("Kac Kilo Domates Almak Istiyorsunuz:");
        domatesKilo = input.nextDouble();
        domatesTutar = domatesKilo * 1.11;
        System.out.print("Kac Kilo Muz Almak Istiyorsunuz:");
        muzKilo = input.nextDouble();
        muzTutar = muzKilo * 0.95;
        System.out.print("Kac Kilo Patlican Almak Istiyorsunuz");
        patlicanKilo = input.nextDouble();
        patlicanTutar = patlicanKilo * 5.00;
        toplamTutar = elmaTutar + armutTutar + domatesTutar + muzTutar + patlicanTutar;
        System.out.print("Toplam Odemeniz Gereken Tutar:"+toplamTutar);




    }
}
