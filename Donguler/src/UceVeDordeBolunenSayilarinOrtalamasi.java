import java.util.Scanner;
public class UceVeDordeBolunenSayilarinOrtalamasi {

	public static void main(String[] args) {
		/*Java döngüler ile 0'dan girilen sayýya kadar olan sayýlardan 3 ve 4'e 
		tam bölünen sayýlarýn ortalamasýný hesaplayan programý yazýnýz.*/
		  Scanner input = new Scanner(System.in);
	        System.out.println("Sayi Giriniz: "); int sayi = input.nextInt();
	        int uceBolunen=0,dordeBolunen=0,ucSayac=0,dortsayac=0;
	        for(int i=0;i<=sayi;i++){
	            if(i%3 == 0){
	               uceBolunen += i;
	               ucSayac++;
	            }
	            if(i%4 == 0){
	                dordeBolunen +=i;
	                dortsayac++;
	            }
	        }
	        int ort = (uceBolunen+dordeBolunen)/(ucSayac+dortsayac);
	        System.out.println("Ortlama: "+ort);

	}

}
