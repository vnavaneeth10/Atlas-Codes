//Time Complexity  : O(n)

//Space Complexity : O(1)

//project to be completed


public class sample2 {

    public static int[] SwapToEnd(int[] Array,int target)
    {
        int j = Array.length - 1;
            for (int i = 0; i < Array.length; i++) 
            {
                if (Array[i] == target && i < (j - 1))
                {
                    while (Array[j] == target && i < (j - 1))
                    {
                        j--;
                    }
                    int temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }
            }
            return Array;
    }
    
    
	public static void main(String[] args) 
	{
	    int[] Array={6,1,6,8,10,4,15,6,3,9,6};
	    int target=6;
	    System.out.print("Before : "); 
	    for(int i=0;i<Array.length;i++)
	    {
	        System.out.print(Array[i]+" "); 
	    }
	    
	    int[] Result=SwapToEnd(Array,target);
	    
	    System.out.print("\nAfter  : "); 
	    for(int i=0;i<Result.length;i++)
	    {
	        System.out.print(Result[i]+" "); 
	    }
	}
    
}
