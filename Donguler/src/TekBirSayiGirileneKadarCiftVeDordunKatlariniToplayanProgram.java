import java.util.Scanner;
public class TekBirSayiGirileneKadarCiftVeDordunKatlariniToplayanProgram {

	public static void main(String[] args) {
//		Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve girilen
//		deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan programý yazýyoruz.
		 Scanner input = new Scanner(System.in);
	        int toplam=0;
	        int sayi;
	        do {
	            System.out.println("Sayi gir: "); sayi = input.nextInt();
	            if(sayi%2 == 0 && sayi%4 == 0){
	                toplam += sayi;
	            }
	        } while (sayi%2==0);
	        System.out.println("Toplam : "+toplam);

	}

}
