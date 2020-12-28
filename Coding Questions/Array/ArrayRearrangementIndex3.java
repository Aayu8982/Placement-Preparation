// Rearrange an array such that arr[i] = i(Hash Approch)


import java.util.*;

class ArrayRearrangementIndex3{

	static void rearrange(int[] arr,int n){
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n;i++){
          s.add(arr[i]);
		}
		for(int i=0;i<n;i++){
			if(s.contains(i))
				arr[i]=i;
			else
				arr[i]=-1;
		}
	}
	public static void main(String[] args){
		int[] arr={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		int n=arr.length;
		rearrange(arr,n);
		for(int aa: arr){
			System.out.print(aa+" ");
		}
	}
}

// Time Complexity -> O(N)
// Space Complexity -> O(1)