
import java.util.Scanner;
public class UcgeninAlaniniHesaplayanProgram {

	public static void main(String[] args) {
		int a,b,c;
		double alan,cevre;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("a kenarý giriniz:");
		a=scan.nextInt();
		System.out.println("b kenarý giriniz:");
		b=scan.nextInt();
		System.out.println("c kenarý giriniz:");
		c=scan.nextInt();
		
		cevre= (double)((a+b+c) / 2);
        alan = Math.sqrt(cevre * (cevre-a) * (cevre-b) * (cevre-a));
      
        System.out.println(alan);
	}

}
