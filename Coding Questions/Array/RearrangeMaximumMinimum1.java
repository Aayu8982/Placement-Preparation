// Rearrange array element such that Maximum minimum form

class RearrangeMaximumMinimum1{

    static void rearrange(int[] arr,int n,int[] arr1){
          int k=0;
          for(int i=0,j=n-1;i<j;i++,j--){
            arr1[k]=arr[j];
            arr1[k+1]=arr[i];
            k=k+2;
          }
          if(n%2!=0)
          	arr1[k]=arr[n/2];
    }

	public static void main(String[] args){
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int[] arr1 = new int[n];
		rearrange(arr,n,arr1);
		for(int aa: arr1){
			System.out.print(aa+" ");
		}
	}
}

// Time Complexity -> O(N)
// Space Complexity -> O(N)