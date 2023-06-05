//Insertion sort
public class insertion {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};
  
        //time complexity = O(n^2)
        //outter loop to count n-1 iterations where arr.length represents n
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            //inner loop, we use j until its greater than 0 to track the sorted part
            int j = i - 1;
                while(j >= 0 && arr[j] > current) {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
                //placement of the element
            arr[j+1] = current;
        }
        printArray(arr);
    }
 
}
