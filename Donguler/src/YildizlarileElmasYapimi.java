import java.util.Scanner;
public class YildizlarileElmasYapimi {

	public static void main(String[] args) {
		//Java'da d�ng�ler kullanarak y�ld�zlar ile elmas yap�n�z.
	    Scanner sc = new Scanner(System.in);
        int i,k,n,j,l,m;
       System.out.println("Sayi giriniz");
       n=sc.nextInt();
   for (i=1;i<=n;i++){
       for (k=n;k>i;k--){
           System.out.print(" ");
       }
   for (j = 1; j <=i ; j++){
           System.out.print("*"+" ");
       }
           System.out.println();
       }

   for (k=1;k<=n;k++){
       for (l =1 ; l <=k; l++) {
           System.out.print(" ");
       }
       for (m = n; m >k ; m--){
           System.out.print("*"+" ");
       }
           System.out.println();
       }
		

	}

}
