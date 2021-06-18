import java.util.Scanner;
public class MukemmelSayiBulma {

	public static void main(String[] args) {
		// Bir sayýnýn kendisi hariç pozitif tam sayý çarpanlarý (kalansýz bölen sayýlarýn) toplamý 
		//kendisine eþit olan sayýya mükemmel sayý denir.
		  Scanner input = new Scanner(System.in);
	         int toplam = 0;
	        
	        System.out.print("Bir sayi giriniz: ");
	        int sayi = input.nextInt();
	        
	        for(int i = 1; i < sayi; i++)
	        {
	            if(sayi % i == 0) {
	                toplam += i;
	            }
	        }
	        if(sayi == toplam) {
	            System.out.println(sayi + " Mükemmel bir sayidir");
	        }
	        else {
	            System.out.println(sayi + " Mükemmel bir sayi degildir.");
	        }

	}

}
