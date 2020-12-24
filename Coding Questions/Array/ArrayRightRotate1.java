// Array Right Rotation (using Reversal Algorithm)

import java.util.*;

class ArrayRightRotate1{

	static void reverse(int[] arr,int start,int end){
		for(int i=start,j=end;i<j;i++,j--){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
    
    static void rightRotate(int[] arr,int n,int d){
    	reverse(arr,0,n-1);
    	reverse(arr,0,d-1);
    	reverse(arr,d,n-1);
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
		rightRotate(arr,n,d);
		System.out.println("Array After Rotation");
		for(int aa:arr)
			System.out.print(aa+" ");

	}
}

// Time Complexity -> O(n)
// Space Complexity -> O(1)