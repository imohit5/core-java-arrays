import java.util.Iterator;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int arr1[];
		
		//int arr2[5]; not valid
		
		int arr3[] = {10,20,30};
		
		int arr4[] = new int[5];
		
		arr4[0] = 1;
		
		arr4[2] = 2; 
		arr4[3] = new Integer(3); 
		
		//arr4[5] = 2; // exception
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		System.out.println("---");
		
		for (int i : arr4) {
			System.out.println(i);
		}
		
		
	}

}
