// Seperate 0,1 and 2 in array.(using count method)

class DutchNationalFlagAlgo1{

   static void separate01and2(int[] arr){
   	int count0=0,count1=0;
   	for(int i=0;i<arr.length;i++){
   		if(arr[i]==0)
   			count0++;
   		if(arr[i]==1)
   			count1++;
   	}
   	for(int i=0;i<count0;i++)
   		arr[i]=0;
   	for(int i=count0;i<(count0+count1);i++)
   		arr[i]=1;
   	for(int i=(count0+count1);i<arr.length;i++)
   		arr[i]=2;
   }

	public static void main(String[] args){
		int[] arr={0,2,1,2,1,0,1,0,2};
		separate01and2(arr);
		for(int aa: arr){
			System.out.print(aa+" ");
		}
	}
}

// Time Complexity -> O(N)(2 time array treversal)
// Space Complexity -> O(1)