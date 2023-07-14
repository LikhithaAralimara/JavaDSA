package Array2;

public class trappedWater {
	
	static int[] trappedWaterdrops(int a[]) {
		int[] l = new int[a.length];
		int[] r = new int[a.length];
		l[0]=a[0];
		for (int i = 1 ; i<a.length ; i++) {
			l[i]= Math.max(a[i],l[i-1]);
			System.out.print("l["+i+"]="+l[i]+"    ");
			
		}
		System.out.println("newline");
		l[a.length-1]=a[a.length-1];
		for(int j=a.length-2;j>=0; j--) {
			r[j]=Math.max(a[j], r[j+1]);
			System.out.print("r["+j+"]="+l[j]+"    ");
		}
		System.out.println("newline\n");
		int maxA = 0;
		int[] atp = new int[a.length];
		for (int i=0; i<a.length-1 ; i++) {
			atp[i]= Math.min(l[i], r[i])-a[i];
		}
		return atp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,2,1,0,1,3,2,1,2,1};
		int[] tw= trappedWaterdrops(a);
		for (int i = 0; i < tw.length; i++) {
			System.out.println("atp[" + i + "] = " + tw[i]);
		}

	}

}
