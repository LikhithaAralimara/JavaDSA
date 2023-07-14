package Array2;

public class leaderArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2,7,6,1,4,3};
		int b[]=new int[a.length];
		
		int max=a[a.length-1];
		 
		int j=0;
		for (int i =a.length-1; i>=0; i--) {
			if (a[i]>=max) {
				b[j] = a[i];
				max=a[i];
				j++;
			}
			
		}
		for (int k =a.length-1; k>=0; k--) {
			System.out.println(b[k]+" ");
		}
	}

}
