package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class StackDS {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack <Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println(stack.toString());
        
    
       System.out.println(stack.peek());
       System.out.println(stack.toString());
       System.out.println("______________");
       Queue<Integer> queue=new LinkedList<>();
       queue.add(1);
       queue.add(2);
       queue.add(3);
       queue.add(3);
       queue.remove();
       System.out.println(queue.toString());
          
    }

}
