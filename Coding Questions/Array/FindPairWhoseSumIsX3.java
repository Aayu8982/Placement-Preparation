// Find a Pair Whose Sum Is X(Hash approch)

import java.util.*;

class FindPairWhoseSumIsX3{
	static void findPair(int[] arr,int x){
		HashSet<Integer> s=new HashSet<Integer>();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			int temp=x-arr[i];
			if(s.contains(temp)){
				System.out.println("Pair is "+arr[i]+" "+temp);
                flag=1;
			}
			s.add(arr[i]);
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

// Time Complexity --> O(n)
// Space Complexity --> O(n)