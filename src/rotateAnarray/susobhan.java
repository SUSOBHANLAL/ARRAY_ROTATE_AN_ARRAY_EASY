package rotateAnarray;

public class susobhan {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,6,7,8,9,10};
		int position =3;
		int pos = position-1; ;
		
		int n = arr.length;
		int arr1[]= new int [n];
		int j =0;
		for(int i =pos;i<n;i++ ) {
			arr1[j++]=arr[i];
		}
		
		for(int i =0;i<=pos-1;i++ ) {
			arr1[j++]=arr[i];
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
