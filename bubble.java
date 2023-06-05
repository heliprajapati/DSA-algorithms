//Bubble sort
class bubble {
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
        //inner loop for the sorted elements
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //to swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
 
       printArray(arr);
   }
}
