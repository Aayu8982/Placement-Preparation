//Find Equilibrium Index in array 

class EquilibriumIndex2{

	static int findEquilibriumIndex(int[] arr,int n){
    	int sum=0, leftSum=0;

    	for(int i=0;i<n;i++){
    		sum+=arr[i];
    	}

    	for(int i=0;i<n;i++){
    		sum-=arr[i];

    		if(leftSum==sum)
    			return i;

    		leftSum+=arr[i];

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

// Time Complexity -> O(N)
//Space Complexity -> O(1)