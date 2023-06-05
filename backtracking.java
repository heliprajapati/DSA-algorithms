public class backtracking {
    public static void printPermutation(String str, int idx, String perm){//int indx is for placing the string xter on any position 
        //time complexity=O(n*n!)
        if (str.length() == 0) {//to know if all the charaters are removed
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {//for traversing the string n which char to put in the current position
            char currChar = str.charAt(i);// current character
            //for removing the current character n take a new substring which is i+1
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, idx + 1, perm + currChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printPermutation(str, 0, "");
    }

}
