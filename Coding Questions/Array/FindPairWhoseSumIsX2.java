// Find a Pair Whose Sum Is X(two pointer approch)

import java.util.*;

class FindPairWhoseSumIsX2{
	static void findPair(int[] arr,int x){
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int flag=0;
		while(left<right){
			if(arr[left]+arr[right]==x){
				System.out.println("pair is "+arr[left]+" "+arr[right]);
				flag=1;
				left++;
				right--;
			}
			else if(arr[left]+arr[right]<x)
				left++;
			else 
				right--;
		}
		if(flag==0)
			System.out.println("No Pair Exist");

	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("Enter Value of X");
		int x=s.nextInt();
		findPair(arr,x);
	}
}

// Time Complexity --> O(nlogn)
// Space Complexity --> O(1)