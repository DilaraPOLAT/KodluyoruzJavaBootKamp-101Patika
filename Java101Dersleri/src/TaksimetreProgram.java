import java.util.Scanner;
public class TaksimetreProgram {

	public static void main(String[] args) {
      int km,acilis_ucreti=10;
	  double km_basina=2.20 ,odenecek;
	  Scanner input=new Scanner(System.in);
	  km=input.nextInt();
	  odenecek=2.20*km +10;
	  if(odenecek>20)
	  {
		  System.out.println("Ödenecek Tutar:"+ odenecek);
	  }
	  else
	  {
		  System.out.println("Ödenecek Tutar:"+20);
	  }
	  

	}

}
