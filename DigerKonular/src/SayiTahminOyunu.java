import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner scan=new Scanner(System.in);
		int number=rnd.nextInt(100);
		int tahmin,i,tahminsyc=0;
	
		for(i=0;i<5;i++)
		{
			System.out.println("Tahmin Giriniz:");
			tahmin=scan.nextInt();
			if(tahmin==number)
			{
				System.out.println("Tebrikler:) "+tahminsyc+". Denemede Doðru Tahmin etiniz.");
			}
			else if(i==4)
			{
				tahminsyc++;
				System.out.println("Malesef:( Yanlýþ Tahmin:"+"Kalan Hak "+(5-tahminsyc)+" Yarýþma bitti.");
				System.out.println("Sayi ="+number);
			}
			else
			{
				tahminsyc++;
				System.out.println("Malesef:( Yanlýþ Tahmin:"+"Kalan Hak "+(5-tahminsyc));
				if(tahmin<0 && tahmin >100)
				{
					System.out.println("Lütfen 0-100 arasýnda bir sayi girin!");
				}
				else if(tahmin>number)
				{
					System.out.println("Tahmin etiðiniz sayý daha küçük bir sayý olacak!");
				}
				
				else 
				{
					System.out.println("Tahmin etiðiniz sayý daha büyük bir sayý olacak!");
				}
				
				
			}
			
		}
		
		

	}

}
