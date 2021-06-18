import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {

	public static void main(String[] args) {
		int heat;
		Scanner input=new Scanner(System.in);
		System.out.println("Sýcaklýk Giriniz:");
		heat=input.nextInt();
		if(heat<5)
		{
			System.out.println("Kayaða gidebilirsiniz.");
		}
		else if(5<=heat && 15>=heat)
		{
			System.out.println("Sinemaya gidebilirsiniz.");
		}
	    if(10<=heat && 25>=heat)
	    {
	    	System.out.println("Pikniðe gidebilirsiniz.");
	    }
	    else if(heat>25)
	    {
	    	System.out.println("Yüzmeye gidebilirsiniz.");
	    }
		

	}

}
