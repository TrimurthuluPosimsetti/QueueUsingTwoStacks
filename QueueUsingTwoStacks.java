import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Stack<Integer> st1=new Stack<Integer>();
        Stack<Integer> st2=new Stack<Integer>();          
        for(int i=0;i<t;i++){
            int category=sc.nextInt();
            if(category==1){
                int val=sc.nextInt();
                st1.push(val);
            }
            else{
                if(st2.isEmpty()){//checking wheather stack is empty or not
                while(!st1.isEmpty()){//if stack 2 is empty we are popping all elements from stack1
                    st2.push(st1.pop());
                }
                }
                if(category==2){        
                    st2.pop();
                }
                else{
                    System.out.println(st2.peek());
                }
            }
        }
    }
}



