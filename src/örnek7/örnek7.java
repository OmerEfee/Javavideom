package örnek7;

import java.util.Scanner;

public class örnek7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
  int n;
  System.out.println("Sayı giriniz:");
  n=scan.nextInt();
  int toplam=0;
  for(int i=0;i<=n;i++) {
	  toplam=toplam+i;
	}
 System.out.println("Toplam sonuç:"+toplam);

}
}
