package Array1;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,2,1,4,6};
		int max=0,s=0;
		int i ;
		
		
		for (i=0;i<a.length ; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		for (int j=0;j<a.length; j++) {
			if(a[j]<max && a[j]>s) {
				s=a[j];
			}
		}
		
		
		System.out.println(s);
		System.out.println(max);

	}

}
