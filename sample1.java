//Time complexity O(n)
//Space complexity O(n)



import java.util.HashSet;
import java.util.Set;

public class sample1 {

    public static int[] twoNumberSum(int[] array, int target){

        Set<Integer> nums = new HashSet<>();

        for(int i=0; i< array.length-1; i++){

           int num = array[i];

           int match = target - num;

           if (nums.contains(match)) {

               return new int[]{num, match};
           } else {
               nums.add(num);
           }
                
                    
        }
        return new int[0];
                
                
    }
     
    public static void main(String[] args) {

        int[] array = {7,5,3,9,4,2,1};

        int target = 10;

        int[] result = twoNumberSum(array, target);

        for(int i=0; i<result.length;i++){

            System.out.println(result[i]);

        }

    }
    
}
        
    
    
