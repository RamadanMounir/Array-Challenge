package Array_Challenge;

import java.util.Scanner;
// this code used to get the biggest number and the second lowest number

public class arrange_An_Array {
	static Scanner input = new Scanner(System.in);
	public static int []ArrayChallenge(int[]arr,int size) {

		int temp;
		for(int i=0;i<size;i++) {
			for (int j=i+1;j<size;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr;

	}

	public static void main (String[] args) {  
		// keep this function call here     

		System.out.println("Enter array size");
		int size = input.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size;i++) {
			System.out.println("Enter array no"+(i+1));
			arr[i]=input.nextInt();
		}
		int[]arr2 =	ArrayChallenge(arr, size);

		//print the biggest number and the second lowest number

		System.out.println("the biggest number = "+arr2[size-1]+"	the second lowest number = "+arr2[1]);	


	}
}
