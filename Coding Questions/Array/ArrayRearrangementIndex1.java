// Rearrange an array such that arr[i] = i

class ArrayRearrangementIndex1{

	static void rearrange(int[] arr,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
                 if(arr[j]==i){
                 	int temp=arr[j];
                 	arr[j]=arr[i];
                 	arr[i]=temp;
                 }
			}
		}

		for(int i=0;i<n;i++){
			if(arr[i]!=i)
				arr[i]=-1;
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

// Time Complexity -> O(N^2)
// Space Complexity -> O(1)