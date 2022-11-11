package java101;

import java.util.Scanner;

public class Vucut_Kitle_Indeksi_Hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double boy,kilo,indeks;
        System.out.print("Lutfen Boyunuzu (m) Giriniz:");
        boy = input.nextDouble();
        System.out.print("Lutfen Kilonuzu (kg) Giriniz:");
        kilo = input.nextDouble();
        indeks=kilo / (boy * boy);
        System.out.print("Vucut Kitle Indeksiniz:"+indeks);

    }
}
