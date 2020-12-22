// Seperate 0,1 and 2 in array.(using 3 way Partition )

class DutchNationalFlagAlgo2{

   static void separate01and2(int[] arr){
     int low=0;
     int high=arr.length-1;
     int mid=0;

     while(mid<=high){
      if(arr[mid]==0){
         int temp=arr[mid];
         arr[mid]=arr[low];
         arr[low]=temp;
         low++;
         mid++;
      }
      else if(arr[mid]==2){
         int temp=arr[mid];
         arr[mid]=arr[high];
         arr[high]=temp;
         high--;
      }
      else{
         mid++;
      }
     }
   }

   public static void main(String[] args){
      int[] arr={0,2,1,2,1,0,1,0,2};
      separate01and2(arr);
      for(int aa: arr){
         System.out.print(aa+" ");
      }
   }
}

// Time Complexity -> O(N)
// Space Complexity -> O(1)