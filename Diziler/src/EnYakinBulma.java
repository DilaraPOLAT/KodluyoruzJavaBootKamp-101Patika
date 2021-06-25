import java.util.Scanner;

public class EnYakinBulma {

	public static void main(String[] args) {
		int[] list = {15,12,788,1,-1,-778,2,0};

		Scanner input =new Scanner(System.in);
	    System.out.println("Bir Sayi Giriniz: " );
	    int sayi=input.nextInt();

	      
        int min =list[0];
        int max =list[0];
        int minsay=list[0],maxsay=list[0];

        for (int i : list) {
            if (i<= sayi && Math.abs(i-sayi)<min) {
                min =Math.abs(i-sayi) ;
                minsay=i;
          
            }
            if (i>=sayi && Math.abs(i-sayi)<max) {
                max = Math.abs(i-sayi);
                maxsay=i;
            }
        }
        
        System.out.println("Girilen sayýdan küçük en yakýn sayý :"+minsay);
        System.out.println("Girilen sayýdan büyük en yakýn sayý :"+maxsay);
	}

}
