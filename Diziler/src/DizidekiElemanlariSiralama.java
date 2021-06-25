import java.util.Scanner;

public class DizidekiElemanlariSiralama {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Dizinin boyutu n :");
		 int n=scan.nextInt();
		 System.out.println();
		 int[] dizi = new int[n];
		 
		 int i,j,temp;
		 System.out.println("Dizinin elemanlarýný giriniz :");
		 for(i=0;i<dizi.length;i++)
		 {
			 System.out.print((i+1)+". Elemaný  :"); 
			 dizi[i]=scan.nextInt();
			 System.out.println();
		 }
		 
		 System.out.println("Sýralama :");
		 for(i=0;i<dizi.length;i++)
		 {
			 for(j=i+1;j<dizi.length;j++)
			 {
				 if(dizi[i]>dizi[j])
				 {
					 temp=dizi[i];
					 dizi[i]=dizi[j];
					 dizi[j]=temp;
					 
				 }
				 
			 }
		 }
		 for(i=0;i<dizi.length;i++)
		 {
			 System.out.print(dizi[i]+" "); 
			 
		 }
		 

	}

}
