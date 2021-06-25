
public class MatrisinTranspozunuBulma {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		int[][] Tarr = new int[3][2];
		int i=0,j=0;
		while(true)//Tarr (Transpoze) matris degerlerini atıyoruz.
		{
			if(j>2)
			{
				break;
			}
			else
			{
				Tarr[j][i]=arr[i][j];
				i=1;
				Tarr[j][i]=arr[i][j];
				i=0;
				j++;
			}	
		}
		
		System.out.println("Matris :");
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpoze : ");
		
		for(i=0;i<Tarr.length;i++)
		{
			for(j=0;j<Tarr[i].length;j++)
			{
				System.out.print(Tarr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
