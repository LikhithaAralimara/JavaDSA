package Array2;

public class maxSubarray {

	static int largestsubarray(int a[]) {
		int cur=0;    //cur == current sum
		
		int max=Integer.MIN_VALUE; 		//max = maxSum
		for (int i=0; i<a.length;i++) {
			cur = cur+a[i];
			if(cur<0) {
				cur=0;
			}
			if (max<cur) {
				max=cur;
			}

			
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-2,7,-6 , 4,1,-3,8};
		int ans= largestsubarray(a);
		System.out.println(ans);
	}

}
