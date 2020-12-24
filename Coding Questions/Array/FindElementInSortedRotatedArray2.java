// Find Element in sorted rotated array.(without pivot element)

class FindElementInSortedRotatedArray2{

	static int findElement(int[] arr,int n,int num){
		int start=0,end=n-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==num)
				return mid;
			else if (arr[start]<arr[mid]){
				if(num>=arr[start] && num<=arr[mid])
					end=mid-1;
				else
					start=mid+1;
			}
			else{
				if(num>=arr[mid] && num<=arr[end])
					start=mid+1;
				else
					end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr={ 156, 235, 457, 21, 32, 43, 74, 75, 86, 97, 108, 149};
		int n=arr.length;
		int num=97;
		int index=findElement(arr,n,num);
		System.out.println("Number "+num+(index>=0 ? (" found at index "+index) : " not found"));
	}
}

// Time Complexity -> O(logn)
// Space Complexity -> O(1)