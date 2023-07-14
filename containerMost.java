package Array2;

public class containerMost {
	
	static int containerWmw(int a[]) {
		int maxA = 0;
		int l=0;
		int r = a.length-1;
		while (l<r) {
			int height = Math.min(a[l],a[r]);
			int distance = r-l;
			int area = distance*height;
			System.out.println(l + " "+ r + " " + area);
			
			maxA = Math.max(maxA, area);
			
		
		if (a[l] < a[r]) {
			l++;
		}
		else {
			r--;
		}
		}
		
		return maxA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 1,8,6,2,4,5,8,3,7};
		int ans= containerWmw(a);
		System.out.println(ans);

	}

}
