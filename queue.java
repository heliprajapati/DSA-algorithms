import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main (String[] args){

        Queue<String> lunchLine = new LinkedList<String>();

            lunchLine.add("Heli");
            lunchLine.add("Nelly");
            lunchLine.add("Ben");
         
         //System.out.println(lunchLine.poll()); removes the person out of the line
         //System.out.println(lunchLine.peek());  prints the next person in line 
         //System.out.println(lunchLine.toArray()[index]); turns it into an array and prints what is in the index

        System.out.println(lunchLine);    

    }

}