// Move all Zero to end of the array.

class MoveAllZeroToEnd1{

	static void moveToEnd(int[] arr,int n){
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
		for(int i=count;i<n;i++)
			arr[i]=0;
	}
	public static void main(String[] args){
		int[] arr= {1, 2, 0, 4, 3, 0, 5, 0};
		int n=arr.length;
		moveToEnd(arr,n);
		for(int aa: arr){
			System.out.print(aa+" ");
		}

	}
}

// Time Complexity -> O(N)
// Space Complexity -> O(1)