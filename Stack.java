public class Stack {
 
    public static void main(String[] args) {
     
        java.util.Stack<String> utensil = new java.util.Stack<String>();

           utensil.push("Plate");
           utensil.push("Cup");
           utensil.push("Fork");
           // System.out.println(utensil.pop()); this removes the top most value
           // System.out.println(utensil.peek()); this shows you the top value but doesnt delete
            // System.out.println(utensil.contains("")); //shows whether the item is in the stack
            //  System.out.println(utensil.get(0)); //shows what is in that index 0,1,2
            // NB;indices start from bottom to top but popping peeking starts from the top
            // .set(index ,value) replaces
           System.out.println(utensil);

    }
}
