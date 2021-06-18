import java.util.Scanner;
public class GirilenSayiyaKadarOlan4ve5inkuvvetleri {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdýran programý yazýyoruz.
	      Scanner sc = new Scanner(System.in);
	        System.out.println("Sayi gir: ");
	        int sayi = sc.nextInt();
	        for(int i=1;i<=sayi;i++){
	            System.out.print("4'üncü katý :"+Math.pow(i, 4));
	            System.out.print("\t5'inci katý : "+Math.pow(i, 5));
	            System.out.println("");
	        }
	}

}
