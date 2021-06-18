import java.util.Scanner;
public class BirSayininBasamakSayilarininToplaminiHesaplayanProgram {

	public static void main(String[] args) {
		//Bir sayýnýn basamak sayýlarýnýn toplamýný hesaplayan program yazýnýz.
		 Scanner sc = new Scanner(System.in);
         System.out.print("Sayiyi Gir: ");
        int num = sc.nextInt();
 
        int adet = 0,toplam=0;
 
        while(num != 0)
        {
           toplam=(num%10)+toplam;
           num /= 10;
            ++adet;
        }
 
        System.out.println("Basamak Toplamý: " + toplam);

	}

}
