package training;
import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName,password;
		
		System.out.print("Lutfen Kullanici Adinizi Giriniz:");
		userName = input.nextLine();
		System.out.print("Lutfen Sifrenizi Giriniz:");
		password = input.nextLine();
		
		if(userName.equals("eren") && password.equals("1234")) {
			System.out.println("Basariyla Giris Yaptiniz");
		
		}else
			System.out.println("Kullanici Adi veya Sifre Yanlis");
	
	}

}
