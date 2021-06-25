
public class DizideTekrarEdenSayilariBulanProgram {
	 static boolean isFind(int[] arr, int value) {
	        for (int i : arr) {
	            if (i == value) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        int[] list = {0,0,3,7,3,0,3,2,9,10,0,21,1,33,9,1};
	        int[] duplicate = new int[list.length];
	        int startIndex = 0,syc=0;
	        System.out.println("Tekrar eden sayilar");
	        for (int i = 0; i < list.length; i++) {
	            for (int j = 0; j < list.length; j++) {
	                if ((i != j) && (list[i] == list[j])) {
	                    if (!isFind(duplicate, list[i])) {
	                        duplicate[startIndex++] = list[i];
	                        System.out.print(list[i]+",");  
	                    }
	                    else if(list[i]==0 && syc==0)
	                    {
	                    	syc++; 
	                    }
	                    break;
	                }
	            }
	        }
	        if(syc!=0)//Dizide 0 deðeri de olabilir.
	        {
	        	 System.out.print(0); 
	        }
	        

	    }
}
