public class target{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 11 ;
        int[] x = find(arr , target);    
        if(x[0]==-1){
            System.out.println("target not found");
        }  else {
            System.out.println("target found at index {"+x[0]+","+x[1]+"}");
        }
    }
    public static int[] find (int[] arr , int target){
        int left = 0 ;
        int right = arr.length-1 ;

        while(left<right){
            int sum = arr[left]+arr[right] ;
            if(target == sum){
                return new int[]{left,right} ;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1} ;
        
    }
}