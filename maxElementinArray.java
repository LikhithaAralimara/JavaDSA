package Array1;

public class maxElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,1,7,2,3};
		int i;
		int max=a[0];
		for (i=0;i<a.length ; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Max is "+ max);
	}

}
