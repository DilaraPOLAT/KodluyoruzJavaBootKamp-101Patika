import java.util.Scanner;
public class RecursiveAsalSayiBulanProgram {

	  public static int sonuc=1;
	  public static int syc=0;
		static int Asalmi(int sayi,int bolen)
		{
			int mod=sayi%(bolen);
			if(mod==0)
			{
				syc++;
			}
			if(bolen==1)
			{
				return 1;
			}
			
			if(syc!=1)
			{
				return 0;
			}
			return Asalmi(sayi,bolen-1);
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Sayi Giriniz :");
			int sayi=input.nextInt();
			if(sayi==0||sayi==1)
			{
				System.out.println(sayi+" sayýsý ASALDIR !");
			}
			else
			{
				int x =Asalmi(sayi,sayi);
				if(x==1)
				{
					System.out.println(sayi+" sayýsý ASALDIR !");
				}
				else
				{
					System.out.println(sayi+" sayýsý ASAL deðildir !");
				}
			}
			
			

		}

}
