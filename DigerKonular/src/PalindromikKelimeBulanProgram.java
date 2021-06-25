import java.util.Scanner;

public class PalindromikKelimeBulanProgram {

	public static void main(String[] args) {
//		Java dilinde kullanýcýnýn girdiði kelimenin "Palindromik" olup olmadýðý bulan bir program yazýyoruz.
//		Eðer bir kelimenin tersten okunuþu yine ayný kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
//		Örnek : abba , asa , kavak, kayak
		Scanner scan= new Scanner(System.in);
		System.out.println("Kelime Giriniz:");
		String kelime=scan.next();
		int i,syc=0,pldmi=0;
		for(i=kelime.length()-1;i>=0;i--)
		{
			
			if(kelime.charAt(i)!=kelime.charAt(syc))
			{
				System.out.println("Palindromik Kelime Deðil!");
				pldmi=1;
				break;
			}
			
			syc++;
		}
		if(pldmi==0)
		{
			System.out.println("Palindromik Kelime.");
		}
		

	}

}
