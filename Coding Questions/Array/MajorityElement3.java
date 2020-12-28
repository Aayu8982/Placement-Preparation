// Find Majority Element in array.

class MajorityElement3{

	static void majorityElement(int[] arr,int n){
		int maxCount=0;
		int index=-1;
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(arr[j]==arr[i])
					count++;
			}
			if(count>maxCount)
			{
				maxCount=count;
				index=i;
			}
		}
		if(maxCount>n/2)
			System.out.println("Majority Element is "+arr[index]);
		else
			System.out.println("No Majority Element Found");
	}
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,2,2,2,2,2};
		int n=arr.length;
		majorityElement(arr,n);
	}
}

// Time Complexity -> O(N)
// Space Complexity -> O(1)