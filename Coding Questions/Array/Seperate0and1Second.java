class Seperate0and1Second{
    static void seprate0and1(int[] arr){
    	int leftIndex=0,rightIndex=arr.length-1;
    	while(leftIndex<rightIndex){
    		while(arr[leftIndex]==0 && leftIndex<rightIndex)
    			leftIndex++;

    		while(arr[rightIndex]==1 && leftIndex<rightIndex)
    			rightIndex--;

    		if(leftIndex<rightIndex){
    			arr[leftIndex++]=0;
    			arr[rightIndex--]=1;
    		}
    	}
    }

	public static void main(String[] args){
		int[] arr = {0,1,0,1,0,1,0,0,0};
		seprate0and1(arr);
		for(int aa: arr)
			System.out.print(aa+" ");
	}
}