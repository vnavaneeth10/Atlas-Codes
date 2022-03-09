//This problem is to find the numbers in an array that gives result 10 when added

//Space Complexity O(1)
//Time Complexity O(n^2)



public class sample {

    public static int[] twoNumberSum(int[] array, int target){
        for(int i=0;i<array.length-1;i++){

            for(int j=i+1; j<array.length; j++){

                if(array[i] + array[j] == target){
                    return new int[]{array[i], array[j]};
                
                    
                }
                
                
                
                    
             }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] array = {7,5,7,9,4,2,3};
        int target = 10;
        int[] result = twoNumberSum(array, target);
        for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}

