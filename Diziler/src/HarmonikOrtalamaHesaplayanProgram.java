
public class HarmonikOrtalamaHesaplayanProgram {

	public static void main(String[] args) {
		   int[] numbers = {1, 2, 3, 4,5,6};
	       float sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum += ((float)(1)/(float)(numbers[i]));
	        }

	        System.out.println( sum);

	}

}
