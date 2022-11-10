package java101;
import java.util.Scanner;

public class Not_Ortalama_Hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat , fizik , kimya , turkce , tarih , muzik;
         System.out.print("Lutfen Matematik Notunuzu Giriniz:");
         mat = input.nextInt();
         System.out.print("Lutfen Fizik Notunuzu Giriniz:");
         fizik = input.nextInt();
         System.out.print("Lutfen Kimya Notunuzu Giriniz:");
         kimya = input.nextInt();
         System.out.print("Lutfen Turkce Notunuzu Giriniz:");
         turkce = input.nextInt();
         System.out.print("Lutfen Tarih Notunuzu Giriniz:");
         tarih = input.nextInt();
         System.out.print("Lutfen Muzik Notunuzu Giriniz:");
         muzik = input.nextInt();

         double ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6;
         System.out.print("Not Ortalamaniz:");
         System.out.print(ortalama);



    }
}
