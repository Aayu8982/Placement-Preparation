// Rearrange array element such that Maximum minimum form

/* Given a sorted array of positive integers, rearrange the array alternately
 i.e first element should be the maximum value, second minimum value,
  third-second max, fourth-second min and so on.
*/

class RearrangeMaximumMinimum1{

    static void rearrange(int[] arr,int n){
          int max=arr[n-1];
          int min=arr[0];
          for(int i=0;i<n;i++){
            if(i%2==0)
            {
                arr[i]=max;
                max--;
            }
            else
            {
              arr[i]=min;
              min++;
            }
          }
    }

	public static void main(String[] args){
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		rearrange(arr,n);
		for(int aa: arr){
			System.out.print(aa+" ");
		}
	}
}


// Time Complexity -> O(N)
// Space Complexity -> O(1)
