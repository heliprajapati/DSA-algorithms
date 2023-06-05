//Selection sort
public class selection { 
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
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;// for storing the index of smallest element
            //inner loop to compare the after elements of the array which are not sorted
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[smallest]) { //checking the smallest
                    smallest = j;
                }
            }
            //to swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
  
        printArray(arr);
    }
 
}
