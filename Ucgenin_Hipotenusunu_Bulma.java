package java101;
import java.util.Scanner;
public class Ucgenin_Hipotenusunu_Bulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("Lutfen a Kenarinin Uzunlugunu Giriniz:");
        a=input.nextInt();
        System.out.print("Lutfen b Kenarinin Uzunlugunu Giriniz:");
        b=input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.print("Ucgenin Hipotenusu:" + c);

    }
}
