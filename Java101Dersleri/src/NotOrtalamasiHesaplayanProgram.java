import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) {
		int  mat, fizik, kimya, turkce, tarih, muzik,sonuc;
		Scanner scan=new Scanner(System.in);
		System.out.println("Matematik Notunuz:");
		mat =scan.nextInt();
		
		System.out.println("Kimya Notunuz:");
		kimya =scan.nextInt();
		
		System.out.println("Fizik Notunuz:");
		fizik =scan.nextInt();
		
		System.out.println("Turkce Notunuz:");
		turkce =scan.nextInt();
		
		System.out.println("Müzik Notunuz:");
		muzik =scan.nextInt();
		

		System.out.println("Tarih Notunuz:");
		tarih =scan.nextInt();
		
		sonuc=mat+kimya+fizik+turkce+muzik+tarih;
		sonuc=sonuc/6;
		
		while(sonuc>60)
		{
			System.out.println("Sýnýfý GEÇTÝ:)");
			break;
		}
		while(sonuc<=60)
		{
			System.out.println("Sýnýfta KALDI :(");
			break;
		}
		



	}

}
