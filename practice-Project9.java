package arrayex;

public class arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single array
		int arr[] = {1,2,3,4,5};
		for (int i =0;i<arr.length;i++) {
			System.out.println("array elements are :"+arr[i]);
		}
		//multidimension array
		int arr1[][] = {{6,7,8,9},{10,11,12,13}};
		for (int j =0;j<arr1.length;j++) {
			for (int k =0;k<arr.length-1;k++) {
				System.out.println("array elements are :"+arr1[j][k]);
			}
		}
			
		}		

}
