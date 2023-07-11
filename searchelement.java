/**
 * 
 */
package Array1;

/**
 * @author LENOVO
 *
 */
public class searchelement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,1,4,6,5};
		int key = 6;
		int res =-1;
		int i;
		for (i=0;i<a.length;i++) {
			if (a[i]==key) {
				res = i;
				break;
			}
		}
		if (res==-1) {
			System.out.println("Key not found");
			
		}
		else {
			System.out.println("Key found at "+ res);
		}
		
			

	}

}
