import java.util.Scanner;
public class GirilenSayilardanMinveMaxDegerliBulanProgram {

	public static void main(String[] args) {
		//Java ile klavyeden girilen N tane sayma sayýsýndan en büyük ve en 
		//küçük sayýlarý bulan ve bu sayýlarý ekrana yazan programý yazýn.
		  Scanner input = new Scanner(System.in);
	         System.out.println("kac sayi girilecek"); int adim = input.nextInt(); 
	        int maks=0,min=0;
	        
	        for (int i=1; i<=adim; i++)
	        {
	            System.out.println(i+". sayiyi giriniz: ");
	            int sayi = input.nextInt();
	            
	            if (i==1)
	            {
	                maks=sayi;
	                min=sayi;
	            }
	            
	            if (sayi>maks)
	                maks=sayi;
	            
	            if (sayi<min)
	                min=sayi;
	        }
	        
	        System.out.println("Maks: "+maks);
	        System.out.println("Min : "+min);

	}

}
