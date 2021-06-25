import java.util.Scanner;

public class PalindromSayilar {

    public static void Palindrommu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int sayi = input.nextInt();
        int ilkdeger = sayi;        
        int uzunluk = String.valueOf(sayi).length();
         
        int kalan,deger=0;
        for (int i = 0; i<uzunluk; i++){
             
            kalan = sayi % 10;
            deger = deger * 10 + kalan;
            sayi = sayi /10;
        }
         
        if(deger == ilkdeger){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir!");
        }
    }
    
    public static void main(String[] args) {
         Palindrommu();
    }

}
