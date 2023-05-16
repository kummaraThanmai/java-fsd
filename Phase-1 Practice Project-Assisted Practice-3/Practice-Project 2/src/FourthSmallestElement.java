import java.util.Arrays;
import java.util.Scanner;
public class FourthSmallestElement {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the size of the list: ");
	        int size = scanner.nextInt();

	        int[] list = new int[size];
	        System.out.print("Enter the list elements: ");
	        for (int i = 0; i < size; i++) {
	            list[i] = scanner.nextInt();
	        }

	        
	        int fourthSmallest = findFourthSmallest(list);

	        
	        System.out.println("The fourth smallest element is: " + fourthSmallest);
	    }

	    public static int findFourthSmallest(int[] list) {
	       
	        Arrays.sort(list);

	      
	        if (list.length < 4) {
	            System.out.println("List has less than 4 elements!");
	            return -1;
	        }

	       
	        return list[3];
	    }
	

}
