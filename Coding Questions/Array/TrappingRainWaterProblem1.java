// Trapping Rain Water Problem

class TrappingRainWaterProblem1{

	static int countTotalWater(int[] arr,int n){
        int total=0;

        for(int i=1;i<n-1;i++){
        	//find maximum element on left side
        	int left=arr[i];
        	for(int j=0;j<i;j++){
        		left=Math.max(left,arr[j]);
        	}
            // find minimum element on right side
        	int right=arr[i];
        	for(int j=i+1;j<n;j++){
        		right=Math.max(right,arr[j]);
        	}
            //update maximum water
        	total+= Math.min(left,right)-arr[i];
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

// Time Complexity -> O(n^2)
// Space Complexity -> O(1)