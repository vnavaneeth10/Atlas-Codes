import java.util.*;

public class SelectionSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++) {
          System.out.print(arr[i]+ " ");  
        }
        System.out.println();
    }



    public static void main(String args[]){
        int arr[] = {9,8,6,7,2,5,1,4,3};

        //Selection sort
        for(int i=0; i<arr.length-1;i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
    
}
