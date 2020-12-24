// Trapping Rain Water Problem

class TrappingRainWaterProblem1{

	static int countTotalWater(int[] arr,int n){
        int total=0;
        int[] left=new int[n];
        int[] right=new int[n];

        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        } 

        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        for(int i=0;i<n;i++){
            total+=Math.min(left[i],right[i])-arr[i];
        }
        return total;
	}
	public static void main(String[] args){
		int[] arr={1,0,2,0,1,0,3,1,0,2};
		int n=arr.length;
		int res=countTotalWater(arr,n);
		System.out.println("Total Water available on bars "+res);
	}
}

// Time Complexity -> O(n)
// Space Complexity -> O(n)