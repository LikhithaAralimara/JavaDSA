package Array1;

public class deleteArrayElement {
	
	public static int delete (int a[], int key) {
		int i=0 ;
		int n=a.length;
		for(;i<n ; i++) {
			if(a[i] == key) {
				break;
			}
		}
		if (i==n) return n;
		for(int j=i ; j<n-1; j++) {
			a[j]=a[j+1];
		}
		return n-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,4,6,5};
		int key = 2;
		delete (a,key);
		for (int e:a) {
			System.out.println(e+" ");
		}
		
//		int i;
//		for (i=0; i<a.length ;i++) {
//			if (a[i]==key) {
//				a[i]=0;
//				
//			}
//		}
//		
//		for (i=0; i<a.length ;i++) {
//			System.out.println(a[i]);
//		}
		
	}

}
