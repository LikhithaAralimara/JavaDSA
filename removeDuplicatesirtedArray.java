package Array1;
//not working 

public class removeDuplicatesirtedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,2,3,4,4,7,7};
		int n= a.length;
		int j =0;
		for (int i =0 ; i<n;i++) {
			if(a[i]!=a[j]) {
				a[j+1]=a[i];
				j++;
			}
		}
		
		for (int e:a) {
			System.out.println(e+" ");
		}
	}
}