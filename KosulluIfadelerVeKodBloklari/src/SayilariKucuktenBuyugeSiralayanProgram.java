import java.util.Scanner;
public class SayilariKucuktenBuyugeSiralayanProgram {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("1.Sayýyý Giriniz:");
		a=input.nextInt();
		System.out.println("2.Sayýyý Giriniz:");
		b=input.nextInt();
		System.out.println("3.Sayýyý Giriniz:");
		c=input.nextInt();
		
		if(a<b && a<c)
		{
			if(b<c)
				System.out.println("a<b<c");
			else
				System.out.println("a<c<b");
		}
		else if(b<a && b<c)
		{
			if(a<c)
				System.out.println("b<a<c");
			else
				System.out.println("b<c<a");
		}
		else
		{
			if(a<b)
				System.out.println("c<a<b");
			else
				System.out.println("c<b<a");
		}

	}

}
