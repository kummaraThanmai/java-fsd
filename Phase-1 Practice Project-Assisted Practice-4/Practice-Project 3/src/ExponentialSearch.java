
public class ExponentialSearch {

	    public static void main(String[] args) {
	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	        int target = 12;
	        int index = exponentialSearch(arr, target);

	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }

	    public static int exponentialSearch(int[] arr, int target) {
	        int length = arr.length;

	        // If the target element is the first element
	        if (arr[0] == target) {
	            return 0;
	        }

	        // Find the range for binary search by repeatedly doubling the index
	        int i = 1;
	        while (i < length && arr[i] <= target) {
	            i *= 2;
	        }

	        // Perform binary search in the identified range
	        int left = i / 2;
	        int right = Math.min(i, length - 1);
	        return binarySearch(arr, target, left, right);
	    }

	    public static int binarySearch(int[] arr, int target, int left, int right) {
	        if (right >= left) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            }

	            if (arr[mid] > target) {
	                return binarySearch(arr, target, left, mid - 1);
	            }

	            return binarySearch(arr, target, mid + 1, right);
	        }

	        return -1; // Element not found
	    }
	

}
