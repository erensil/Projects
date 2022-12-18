package training;
import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v1,v2,select;
		
		System.out.print("Lutfen 1.Sayiyi Giriniz:");
		v1 = input.nextInt();
		System.out.print("Lutfen 2.Sayiyi Giriniz;");
		v2 = input.nextInt();
		System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz:");
		select = input.nextInt();
		
		if(select == 1) {
			System.out.println("Sonuc:" + (v1+v2));
		}else if(select == 2) {
			System.out.println("Sonuc:" + (v1-v2));
		}else if(select == 3) {
			System.out.println("Sonuc:" + (v1*v2));
		}else if(select == 4) {
			if(v2 != 0) {
				System.out.println("Sonuc:" + (v1/v2));
			}else
				System.out.println("Hicbir Sayi Sifira Bolunmez");
		}else
			System.out.println("Lutfen Gecerli Bir Islem Seciniz");
		}

}
