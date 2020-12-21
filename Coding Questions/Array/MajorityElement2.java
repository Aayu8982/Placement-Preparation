//find majority element in array (Moore Voting Law Algorithm)

import java.util.Scanner;

class MajorityElement2{

	static boolean isMajority(int[] arr,int n,int majorityElement){
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]==majorityElement)
				count++;
		}
		if(count>(n/2))
			return true;
		return false;
	}

	static int getMajorityElement(int[] arr,int n){
		int majorityIndex=0,count=1;
		for(int i=0;i<n;i++){
			if(arr[majorityIndex]==arr[i])
				count++;
			else
				count--;
			if(count==0){
				majorityIndex=i;
				count=1;
			}
		}
		return arr[majorityIndex];
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int majorityElement = getMajorityElement(arr,n);
        if(isMajority(arr,n,majorityElement)){
        	System.out.println("Majority Element is "+majorityElement);
        }
        else{
        	System.out.println("No Majority Element Found");
        }
	}
}

// Time Complexity -> O(n)
// Space Complexity -> O(1)