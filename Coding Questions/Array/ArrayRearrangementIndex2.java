// Rearrange an array such that arr[i] = i

class ArrayRearrangementIndex2{

	static void rearrange(int[] arr,int n){
		for(int i=0;i<n;i++){
			if(arr[i]>=0 && arr[i]!=i){
				int temp=arr[arr[i]];
				arr[arr[i]]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		int n=arr.length;
		rearrange(arr,n);
		for(int aa: arr){
			System.out.print(aa+" ");
		}
	}
}

// Time Complexity -> O(N)
// Space Complexity -> O(1)