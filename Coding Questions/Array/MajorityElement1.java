//Find Majority Element in Array.

import java.util.*;

class MajorityElement1{

	static int findElement(int[] arr,int n){
		Arrays.sort(arr);
		int lastElement = (n%2==0) ? n/2 : (n/2)+1;
		for(int i=0;i<lastElement;i++){
			if(arr[i+n/2]==arr[i])
				return arr[i];
		}
		return 0;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
         arr[i]=s.nextInt();
		}
		int res=findElement(arr,n);
		if(res==0)
			System.out.println("No Majority Element Found");
		else
			System.out.println("Majority Element is "+res);

	}
}

// Time Complexity -> O(nlogn)
// Space Complexity -> O(1)