import java.util.Scanner;

public class KDVTutariHesaplayanProgram {

	public static void main(String[] args) {
		double tutar,sonuc;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ücret Tutarýný Giriniz:");
		tutar=scan.nextDouble();
		
		if(0<tutar && tutar<1000)
		{
			double KDV_tutarý = 0.18;
			sonuc= KDV_tutarý * tutar+tutar;
			System.out.println(sonuc);
			
		}
		else
		{

			double KDV_tutarý = 0.08;
			sonuc= KDV_tutarý * tutar+tutar;
			System.out.println(sonuc);
		}
	

	}

}
