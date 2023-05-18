
public class InsertionSort {

			public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				int x[] = {10, 4, 2, -1, 5};
				
				System.out.println("Actual Values : ");
				for(int n : x)
					System.out.print(n + "\t");
				
				for(int i=1;i<x.length;i++)
				{
					int temp = x[i];
					int j=i-1;
					while(j>=0 && x[j]>temp)
					{
						x[j+1] = x[j];
						j--;
					}
					
					x[j+1] = temp;
				}
				
				System.out.println("\nSorted Values in Asending Order : ");
				for(int n : x)
					System.out.print(n + "\t");
			}
		}


	}

}
