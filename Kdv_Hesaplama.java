package java101;
import java.util.Scanner;

public class Kdv_Hesaplama {
    public static void main(String[] args) {
        double kdvsizFiyat , kdvOran=0.18 , kdvliFiyat;
        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen Urunun Fiyatini Giriniz:");
        kdvsizFiyat= input.nextDouble();
        kdvliFiyat=(kdvsizFiyat * kdvOran)+kdvsizFiyat;
        System.out.print("Urunun Kdv'li Fiyati:"+ kdvliFiyat);


    }
}
