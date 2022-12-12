package örnek10;

import java.util.Scanner;

public class örnek10 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int v,f, ort;
        System.out.println("Vize notu:");
        v=scan.nextInt();
        System.out.println("Final notu:");
        f=scan.nextInt();
        ort=(v*40/100)+(f*60/100);
        if(ort<0)
        {
        	System.out.println("Hatalı işlem var");
        	
        }
        else if(ort<50) {
        	System.out.println(ort+"Dersten kaldınız");
        	
        } 
        else if(ort<70) {
        	System.out.println(ort+"Dersten geçtiniz (orta)");
        }
        else {
        	System.out.println(ort+"Dersten geçtiniz (iyi)");
        }
	}
	

}
