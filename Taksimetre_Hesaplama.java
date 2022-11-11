package java101;

import java.util.Scanner;

public class Taksimetre_Hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double km,acilisUcreti=10,minimumUcret=20,ucret;
        System.out.print("Lutfen Kac Km Gitmek Istediginizi Giriniz:");
        km= input.nextDouble();
        ucret=acilisUcreti+(km*2.20);
        ucret=(ucret<minimumUcret) ? minimumUcret : ucret;
        System.out.print("Odemeniz Gereken Ucret:"+ ucret);


    }
}
