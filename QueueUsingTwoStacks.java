import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //reading number of testcase value
        Stack < Integer > st1 = new Stack < Integer > (); //creating a stack
        Stack < Integer > st2 = new Stack < Integer > (); //creating a stack      
        for (int i = 0; i < t; i++) {
            int category = sc.nextInt(); //reading the Integer value 
            if (category == 1) {
                int val = sc.nextInt();
                st1.push(val); //pushing elements to stack
            } else {
                if (st2.isEmpty()) { //checking wheather stack is empty or not
                    while (!st1.isEmpty()) { //if stack 2 is empty we are popping all elements from stack1
                        st2.push(st1.pop());
                    }
                }
                if (category == 2) {
                    st2.pop(); //popping element from the stack2
                } else {
                    System.out.println(st2.peek()); //printing the top element in the stack 2
                }
            }
        }
    }
}
