import java.util.Scanner;
public class RecurciveFibbonaci {
	static int fibbonaci(int sayi)
	{
		if(sayi<=1)
		{
			return sayi;
		}
		return fibbonaci(sayi-1) + fibbonaci(sayi-2);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Sayi Giriniz:");
		int sayi=input.nextInt();
		System.out.println(fibbonaci(sayi));
		

	}

}
