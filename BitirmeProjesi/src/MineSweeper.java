import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random rnd=new Random();
		int m,n,random;
		System.out.print("Satýr Giriniz:");
		m=input.nextInt();
		System.out.print("Sütun Giriniz:");
		n=input.nextInt();
		String[][] dizi=new String[m][n];
		String[][] Mdizi=new String[m][n];
		random=(m*n)/4;
		int i,j;
		for(i=0;i<dizi.length;i++)
		{
			for(j=0;j<dizi[i].length;j++)
			{
				dizi[i][j]="-";
			}
		}
		
		for(i=0;i<Mdizi.length;i++)
		{
			for(j=0;j<Mdizi[i].length;j++)
			{
				Mdizi[i][j]="-";
			}
		}
		int x,y;
		for(i=0;i<random;i++)
		{
			
			x=rnd.nextInt(m);
			y=rnd.nextInt(n);
			Mdizi[x][y]="*";
		}
		
		int value=0;
		while(true)
		{
			if(value==((m*n)-random))
			{
				System.out.println("Oyunu Kazandýnýz !");
				break;
			}
			System.out.println("Mayýnlarýn Konumu");
			for(i=0;i<Mdizi.length;i++)
			{
				for(j=0;j<Mdizi[i].length;j++)
				{
					System.out.print(Mdizi[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println("======================================");
		System.out.println("Mayýn Tarlasý Oyuna Hoþgeldiniz !");
		for(i=0;i<dizi.length;i++)
		{
			for(j=0;j<dizi[i].length;j++)
			{
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
		int sat,sut,syc=0;
		while(true)
		{
			
			System.out.print("Satýr Giriniz:");
			sat=input.nextInt();
			System.out.print("Sütun Giriniz:");
			sut=input.nextInt();
			if(sat<m&&sut<n)
			{	
				break;
			}
			System.out.print(m+"-"+n+"matris aralýðýnda boyut giriniz!");
		}
		
		
		if(Mdizi[sat][sut].equals("*"))
		{
			System.out.println("Game Over!!");
			break;
			
		}
		else if(sat+1<m&&sut+1<n&&sat-1>=0&&sut-1>=0)
		{
			if(Mdizi[sat+1][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat+1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut-1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut-1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat+1][sut-1]=="*")
			{
				syc++;
			}
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}
		else if(sat+1<m&&sut+1<n&&sat-1>=0)
		{
			if(Mdizi[sat+1][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat+1][sut]=="*")
			{
				syc++;
			}
			
			if(Mdizi[sat-1][sut]=="*")
			{
				syc++;
			}
			
			if(Mdizi[sat-1][sut+1]=="*")
			{
				syc++;
			}
			dizi[sat][sut]=String.valueOf(syc);
			value++;
			
		}
		else if(sat+1<m&&sut+1<n&&sut-1>=0)
		{
			if(Mdizi[sat+1][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat+1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut-1]=="*")
			{
				syc++;
			}
		
			if(Mdizi[sat+1][sut-1]=="*")
			{
				syc++;
			}
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}
		else if(sut+1<n && sat-1>=0 &&sut-1>=0)
		{
			
			if(Mdizi[sat][sut+1]=="*")
			{
				syc++;
			}
			
			if(Mdizi[sat][sut-1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut-1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut+1]=="*")
			{
				syc++;
			}
			
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}
		else if(sat+1<m &&sat-1>=0 &&sut-1>=0)
		{
			
			if(Mdizi[sat+1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut-1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut-1]=="*")
			{
				syc++;
			}
			
			if(Mdizi[sat+1][sut-1]=="*")
			{
				syc++;
			}
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}
		else if(sat+1<m && sut+1<n)
		{
			if(Mdizi[sat+1][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut+1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat+1][sut]=="*")
			{
				syc++;
			}
			
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}
		else if(sat-1>=0&&sut-1>=0)
		{
			
			if(Mdizi[sat][sut-1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat-1][sut-1]=="*")
			{
				syc++;
			}
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}
		else if(sat-1>=0&&sut+1<n)
		{
			
		
			if(Mdizi[sat][sut+1]=="*")
			{
				syc++;
			}
			
			if(Mdizi[sat-1][sut]=="*")
			{
				syc++;
			}
			
			if(Mdizi[sat-1][sut+1]=="*")
			{
				syc++;
			}
			
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}
		else if(sat+1<m && sut-1>=0)
		{
			if(Mdizi[sat+1][sut]=="*")
			{
				syc++;
			}
			if(Mdizi[sat][sut-1]=="*")
			{
				syc++;
			}
			if(Mdizi[sat+1][sut-1]=="*")
			{
				syc++;
			}
			dizi[sat][sut]=String.valueOf(syc);
			value++;
		}

		for(i=0;i<dizi.length;i++)
		{
			for(j=0;j<dizi[i].length;j++)
			{
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	}

}
