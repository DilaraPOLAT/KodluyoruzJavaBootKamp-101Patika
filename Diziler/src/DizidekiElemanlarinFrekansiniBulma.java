import java.util.Arrays;
public class DizidekiElemanlarinFrekansiniBulma {

	public static boolean varmi(int[] dizi,int value,int syc)
	{
		int i;
		for(i=0;i<syc;i++)
		{
			if((dizi[i]==value))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
	
		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		System.out.println("Dizi:"+Arrays.toString(dizi));
		System.out.println("Tekrar Sayýlarý");
		int i,j,syc;
		for(i=0;i<dizi.length;i++)
		{
			syc=0;
			if(varmi(dizi,dizi[i],i))
			{
				continue;
			}
			for(j=0;j<dizi.length;j++)
			{
				if(dizi[i]==dizi[j])
				{
					syc++;
					
				}
			}
			
			System.out.println(dizi[i]+" sayýsý "+syc+" kere tekrar edildi.");
		}
		

	}

}
