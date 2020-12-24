// Array Rotation (Rotate one by one approch)

import java.util.*;

class ArrayRotate2{

	static void arrayRotateByd(int[] arr,int n){
		int temp=arr[0];

		for(int i=0;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
    
    static void rotate(int[] arr,int n,int d){
    	for(int i=0;i<d;i++){
    		arrayRotateByd(arr,n);
    	}
    }

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements in array");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("How much time you want to rotate an array");
		int d=s.nextInt();
		rotate(arr,n,d);
		System.out.println("Array After Rotation");
		for(int aa:arr)
			System.out.print(aa+" ");

	}
}

// Time Complexity -> O(N*d)
// Space Complexity -> O(1)
