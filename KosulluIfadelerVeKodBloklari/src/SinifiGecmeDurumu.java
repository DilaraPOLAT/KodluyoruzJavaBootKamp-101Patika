import java.util.Scanner;

public class SinifiGecmeDurumu {
	public static void main(String[] args) {
		int  mat, fizik, kimya, turkce, muzik,sonuc=0,DersSayisi=0;
		double Tsonuc;
		Scanner scan=new Scanner(System.in);
		System.out.println("Matematik Notunuz:");
		mat =scan.nextInt();
		if(mat>=0 && mat<=100)
		{
			sonuc+=mat;
			DersSayisi++;
		}
		
		System.out.println("Kimya Notunuz:");
		kimya =scan.nextInt();
		if(kimya>=0 && kimya<=100)
		{
			sonuc=kimya+sonuc;
			DersSayisi++;
		}
		
		System.out.println("Fizik Notunuz:");
		fizik =scan.nextInt();
		if(fizik>=0 && fizik<=100)
		{
			sonuc+=fizik;
			DersSayisi++;
		}
		
		System.out.println("Turkce Notunuz:");
		turkce =scan.nextInt();
		if(turkce>=0 && turkce<=100)
		{
			sonuc+=turkce;
			DersSayisi++;
		}
		
		System.out.println("Müzik Notunuz:");
		muzik =scan.nextInt();
		if(muzik>=0 && muzik<=100)
		{
			sonuc+=muzik;
			DersSayisi++;
		}
		
		Tsonuc=sonuc/DersSayisi;
		if(Tsonuc>=55)
		{
			System.out.println("TEBRÝKLER sýnýfý geçtiniz."+"Gecme Notu:"+Tsonuc);
		}
		else
		{
			System.out.println("MALESEF sýnýfta kaldýnýz."+"Gecme Notu:"+Tsonuc);
		}
	}

}
