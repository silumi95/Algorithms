public class ArraySum {
    int[] arr = {1, 2, 3, 4};
    int sum = 0;
    public int calculateArraySum()
    {
    for(int i=0; i<arr.length; i++)
    {
       sum+=arr[i];
    }
    return sum;
   }
}
