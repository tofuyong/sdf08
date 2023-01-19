package sdf;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public void example(){
        Stack<Integer> stack = new Stack<Integer>();
        
        //Pushing or putting something onto the stack (FILO/LIFO)
        for (int i = 0; i < 10; i++){
            stack.push(i);
        }

        //Pop or taking something from stack
        for (int i = 0; i < 5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack Item (pop) : " + stackItem);
        }

        //See what the last item on top of stack is
        Integer item = stack.peek();
        System.out.println("Item on top of stack: " + item);

        Integer firstItem = stack.firstElement();
        System.out.println("First element of Stack: " + firstItem);

        Integer idxElement = stack.search(2);
        System.out.println("Stack element found at index " + idxElement);

        //Iterating through a stack (iterator starts from bottom of stack)
        Iterator<Integer> its = stack.iterator();
        while(its.hasNext()) {
            Integer stackIt = its.next();
            System.out.println("Iterator stack item :" + stackIt);
        }
    }
}
