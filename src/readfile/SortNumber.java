package readfile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 1)Create a method checkForDuplicates. that accepts an arraylist of integers
 * and return a boolean.
 * 
 * if arraylist has any duplication method returns false.
 * otherwise returns true
 * 
 * ex: list1 --> 3,4,5,6
 *      list2 --> 4,4,6,3,244,44,44
 * 
 * print checkForDuplicates(list1) --> false
 * print checkForDuplicates(list2) --> true
 * 
 * 2) Find the second largest number in a list without sorting your list
 * 
 * 
 */
public class SortNumber {

	public static int getArray(List<Integer> arr) {
		Integer secondLargest = arr.get(0);
		Integer temp;
		for (int a = 1; a < arr.size() - 1; a++) {
			if (secondLargest > arr.get(a)) {
				temp = secondLargest;
				secondLargest = arr.get(a);
			}
		}
		return Integer.valueOf(arr.get(arr.size() - 1));
	}

	public static void main(String[] args) {
		//int[] arr = { 1, 4, 2, 5, 6, 2, 3 };
//
//		int temp;
//		for (int a = 0; a < arr.length; a++) {
//			for (int b = a + 1; b < arr.length; b++) {
//				if (arr[a] > arr[b]) {
//					temp = arr[a];
//					arr[a] = arr[b];
//					arr[b] = temp;
//				}
//			}
//
//		}
//		for (int nu : arr) {
//			System.out.print(nu + " ");
//		}
//		System.out.println();
//			for(int i=0;i<arr.length;i++) {
//				int lowIndex=i;
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[j]<arr[lowIndex]) {
//						lowIndex=j;
//					}
//				}
//				int tempp=arr[i];
//				arr[i]=arr[lowIndex];
//				arr[lowIndex]=tempp;
//				
//			}
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		// System.out.println(arr[arr.length-1]);

		 List<Integer> ar= new ArrayList<>();
		 ar.add(8);
		 ar.add(5);
		 ar.add(2);
		 ar.add(8);
		 ar.add(3);
		 ar.add(4);
		 
		 for(int a=0;a<ar.size();a++) {
			 for(int b=a+1;b<ar.size();b++) {
				 if(ar.get(a)>ar.get(b)) {
					 
					 
				 }
			 }
		 }
		 System.out.println(ar.toString());
	

	}

}
