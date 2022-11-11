package java101;

import java.util.Scanner;

public class Dairenin_Alani_Ve_Cevresi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int islem;
        double r,pi=3.14,cevre,alan;
        System.out.print("Lutfen Dairenin Yaricapini Giriniz:");
        r= input.nextDouble();
        cevre=2*pi*r;
        alan=pi*(r*r);
        System.out.println("Dairenin Cevresi:"+cevre);
        System.out.print("Dairenin Alani:"+alan);

    }
}
