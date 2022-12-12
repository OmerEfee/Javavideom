package örnek1;
import java.util.Scanner;
public class örnek1{

	
		public static void main(String[] args) {
			//Kullanıcıdan girilen 2 sayının ortalamasını bulan java kodu:
			Scanner scan=new Scanner(System.in);
			int s1,s2;
			System.out.println("Lütfen iki sayı giriniz");
			s1=scan.nextInt();
			s2=scan.nextInt();
			 int ort= (s1+s2)/2;
			 System.out.println("Girilen iki sayının ortalaması:"+ort);
	   
	   
		}

	}