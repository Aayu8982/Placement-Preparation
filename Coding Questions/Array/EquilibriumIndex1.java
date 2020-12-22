//Find Equilibrium Index in array 

class EquilibriumIndex1{

    static int findEquilibriumIndex(int[] arr,int n){
    	int leftSum,rightSum;
    	for(int i=0;i<n;i++){
    		leftSum=0;
    		for(int j=0;j<i;j++)
    			leftSum+=arr[j];

    		rightSum=0;
    		for(int k=i+1;k<n;k++)
    			rightSum+=arr[k];

    		if(leftSum==rightSum)
    			return i;
    	}
    	return -1;
    }

	public static void main(String[] args){
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int n=arr.length;
		int res=findEquilibriumIndex(arr,n);
		System.out.println("Equilibrium Index is "+res);
	}
}

// Time Complexity -> O(N^2)
// Space Complexity -> O(1)