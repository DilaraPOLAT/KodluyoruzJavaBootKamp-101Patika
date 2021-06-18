import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Ýþlem yapýlacak ilk sayýyý giriniz:");
		int ilk_sayi=input.nextInt();
 		System.out.println("Ýþlem yapýlacak ikinci  sayýyý giriniz:");
 		int ikinci_sayi=input.nextInt();
 		System.out.println("Toplama iþlemi için '1' \nÇýkarma iþlemi için '2'\nÇarpma iþlemi için '3'\n"
 				+ "Bölme iþlemi için '4'\nMod alma iþlemi için '5' Basýnýnz...");
 		int islem=input.nextInt();
 		double sonuc;
 		
 		switch(islem)
 		{
 		case 1:
 			sonuc=ilk_sayi+ikinci_sayi;
 			System.out.println("Sonuç:"+sonuc);
 			break;
 		case 2:
 			sonuc=ilk_sayi-ikinci_sayi;
 			System.out.println("Sonuç:"+sonuc);
 			break;
 		case 3:
 			sonuc=ilk_sayi*ikinci_sayi;
 			System.out.println("Sonuç:"+sonuc);
 			break;
 		case 4:
 			sonuc=ilk_sayi/ikinci_sayi;
 			System.out.println("Sonuç:"+sonuc);
 			break;
 		case 5:
 			sonuc=ilk_sayi%ikinci_sayi;
 			System.out.println("Sonuç:"+sonuc);
 			break;
 		default:
 			System.out.println("Ýþlem girmediniz :(");
 			
 		}

	}

}
