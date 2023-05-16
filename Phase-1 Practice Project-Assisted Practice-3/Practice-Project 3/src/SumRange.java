import java.util.Scanner;

public class SumRange {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        
	        System.out.print("Enter the value of L (0 <= L <= n-1): ");
	        int L = scanner.nextInt();
	        System.out.print("Enter the value of R (L <= R <= n-1): ");
	        int R = scanner.nextInt();

	       
	        if (L < 0 || R >= n || L > R) {
	            System.out.println("Invalid range values!");
	            return;
	        }

	       
	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            array[i] = i;
	        }

	        
	        int sum = 0;
	        for (int i = L; i <= R; i++) {
	            sum += array[i];
	        }

	        // Print the sum
	        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);
	    }
	}


