import java.util.Scanner;
public class BurcBulanProgram {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Dogdunuz ay:(kucuk harf kullanýnýz)");
	        String o = "ocak",s = "subat",ma = "mart",ni = "nisan",mayi="mayis",haz="haziran",
	                tem="temmuz",agu="agustos",eyl="eylul",ekm="ekim",ksm="kasim",aralk="aralik";
	        
	        String ay = sc.nextLine();
	        System.out.print("Dogdugunuz gun: ");
	        int gun = sc.nextInt();
	        if(o.equals(ay)){
	            if(gun>=22){
	                System.out.println("Kova");
	            }else{
	                System.out.println("Oðlak");
	            }
	        }else if(s.equals(ay)){
	            if(gun>=20){
	                System.out.println("Balýk");
	            }else{
	                System.out.println("Kova");
	            }
	        }else if(ma.equals(ay)){
	            if(gun>=21){
	                System.out.println("Koc");
	            }else{
	                System.out.println("Balýk");
	            }
	        }else if(ni.equals(ay)){
	            if(gun>=21){
	                System.out.println("Boða");
	            }else{
	                System.out.println("Koc");
	            }
	        }else if(mayi.equals(ay)){
	            if(gun>=22){
	                System.out.println("Ýkizler");
	            }else{
	                System.out.println("Boða");
	            }
	        }else if(haz.equals(ay)){
	            if(gun>=23){
	                System.out.println("Yengec");
	            }else{
	                System.out.println("Ýkizler");
	            }
	        }else if(tem.equals(ay)){
	            if(gun>=23){
	                System.out.println("Aslan");
	            }else{
	                System.out.println("Yengec");
	            }
	        }else if(agu.equals(ay)){
	            if(gun>=23){
	                System.out.println("Baþak");
	            }else{
	                System.out.println("Aslan");
	            }
	        }else if(eyl.equals(ay)){
	            if(gun>=23){
	                System.out.println("Terazi");
	            }else{
	                System.out.println("Baþak");
	            }
	        }else if(ekm.equals(ay)){
	            if(gun>=23){
	                System.out.println("Akrep");
	            }else{
	                System.out.println("Terazi");
	            }
	        }else if(ksm.equals(ay)){
	            if(gun>=22){
	                System.out.println("Yay");
	            }else{
	                System.out.println("Akrep");
	            }
	        }else if(aralk.equals(ay)){
	            if(gun>=22){
	                System.out.println("Oðlak");
	            }else{
	                System.out.println("Yay");
	            }
	        }else{
	            System.out.println("Böyle bir ay yok");
	        } 

	}

}
