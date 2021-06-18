import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String kullanici_adi="Dilara";
		String sifre="java 101";
		System.out.println("Kullanýcý adý giriniz:");
		String ad_giris =input.nextLine();
		if(kullanici_adi.equals(ad_giris))
		{
			System.out.println("Kullanýcý adý DOÐRU:)");
		}
		else
		{
			System.out.println("Kullanýcý adý YANLIÞ!!!");
			System.out.println("Þifre sýfýrlamak ister misiniz?");
			System.out.println("Cevabýnýz evet ise 'E' ye Hayýr ise 'H' basýnýz...");
			String cevap = input.next();
			if(cevap.equals("E"))
			{
				input.nextLine();
				while(true)
			  {
				System.out.println("Yeni þifre Giriniz:");
				
				String Yenisifre=input.nextLine();
				if(Yenisifre.equals(sifre))
				{
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				}
				else
				{
					System.out.println("Þifre olusturuldu :)");
					break;
				}
			 }
			}
			else
			{
				System.out.println("Programdan Çýktýnýz :(");
			}
			
		}
		
		

	}

}
