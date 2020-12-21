// Find a Pair Whose Sum is X(naive approch)

import java.util.*;
class FindPairWhoseSumIsX{

	static void findPair(int[] arr,int x){
	  int flag=0;
      for(int i=0;i<arr.length-1;i++){
      	for(int j=i+1;j<arr.length;j++){
      		if(arr[i]+arr[j]==x){
      			System.out.println("Pair is "+arr[i]+" "+arr[j]);
      			flag=1;
      		}
      	}
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

// Time Complexity --> O(n^2)
// Space Complexity --> O(1)