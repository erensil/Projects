package training;
import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matematik,turkce,fen,sosyal,ingilizce;
		double average;
		
		System.out.print("Lutfen Matematik Notunuzu Giriniz:");
		matematik = input.nextInt();
		
		System.out.print("Lutfen Turkce Notunuzu Giriniz:");
		turkce = input.nextInt();
		
		System.out.print("Lutfen FenBilgisi Notunuzu Giriniz:");
		fen = input.nextInt();
		
		System.out.print("Lutfen SosyalBilgiler Notunuzu Giriniz:");
		sosyal = input.nextInt();
		
		System.out.print("Lutfen Ingilizce Notunuzu Giriniz:");
		ingilizce = input.nextInt();
		
		average = (matematik+turkce+fen+sosyal+ingilizce)/5;
		
		if(average >= 55) {
			System.out.println("Ortalamaniz:" + average);
			System.out.println("Tebrikler Sinifi Gectiniz !!");
		}else{
			System.out.println("Ortalamaniz:" + average);
			System.out.println("Malesef Sinifi Gecemediniz !!");
		}
		
		}

}
