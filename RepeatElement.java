class RepeatElement
{
    void printRepeating(int arr[], int size)
    {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size-1; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }
 
    public static void main(String[] args)
    {
        RepeatElement repeat = new RepeatElement();
        int arr[] = {15,10,15,2,3,5,10,2,4,5,3};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }
}