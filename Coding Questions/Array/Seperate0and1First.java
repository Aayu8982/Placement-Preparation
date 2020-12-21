// Seperate 0 and 1 in array(using count method)

class Seperate0and1First{
	static void seprate0and1(int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				count++;
		}
		for(int i=0;i<count;i++)
			arr[i]=0;
		for(int i=count;i<arr.length;i++)
			arr[i]=1;
	}
	public static void main(String[] args){
		int[] arr = {0,1,0,1,0,1,0,0,0};
		seprate0and1(arr);
		for(int aa: arr)
			System.out.print(aa+" ");
	}
}

// Time Complexity -> O(n)(array treverse 2 times)
// Space Complexity -> O(1)