import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
	public static int value1,value2;
		static void Desenazalt(int sayi)
		{
			if(sayi<=0)
			{
			    value1=sayi;
				return;
			}
			System.out.print(" "+sayi);
			Desenazalt(sayi-5);
		}
		static void Desenartir(int sayi)
		{
			if(sayi==value2)
			{	System.out.print(" "+sayi);		
				return;
			}
			System.out.print(" "+sayi);
			Desenartir(sayi+5);
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Taban deðeri giriniz :");
			int sayi=input.nextInt();
			value2=sayi;
	        Desenazalt(sayi);
	        Desenartir(value1);
			
			

		}

}
