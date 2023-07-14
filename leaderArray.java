package Array2;

//here is my code - but last ele 3 is not printin gas i am not able to compare 3 to any elements and my code compares and decides if it is the leader 
//sirs code written in book has great implementation but with O(n^2) complexity 
//next program has complexity of O(n) 
//its actually pretty amazing 


public class leaderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2,7,6,1,4,3};
		int leader[]=new int[a.length];
		int k=0;
		for (int i =0; i<a.length; i++) {
			for (int j=i+1; j<a.length ; j++) {
				
				if(a[j]>a[i]) {
					System.out.println(a[i] +" is not leader element."+i+" "+j);
					break;
//					j++;
				}
				else {
					leader[k]=a[i];
					System.out.println(leader[k]);
					k++;
					
					break;
				}
			}
		}
	for(int l=0;l<a.length; l++) {
		System.out.println(leader[l]);
	}
	}

}
