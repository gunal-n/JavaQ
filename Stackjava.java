
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();  // Creates a stack of integers

//         st.push(10);   // Pushes 10 onto the stack
//         st.push(20);   // Pushes 20 onto the stack
//         st.push(30);   // Pushes 30 onto the stack

//         System.out.println("Stack: " + st.peek());  // Shows the top element (30)
//         System.out.println("Stack is empty: " + st.isEmpty());  // Checks if stack is empty (false)
//         System.out.println("Stack: " + st);  // Prints the entire stack ([10, 20, 30])
//     }
// }

//In ARRAY way//
// class Stack {
//     int size;
//     int[] arr;
//     int top;

//     // Constructor
//     Stack(int size) {
//         this.size = size;
//         this.arr = new int[size];  // Correctly assign to instance variable
//         this.top = -1;
//     }

//     // Push method
//     void push(int data) {
//         if (top == arr.length - 1) {
//             System.out.println("Stack Overflow");
//         } else {
//             arr[++top] = data;
//         }
//     }

//     // Pop method
//     int pop() {
//         if (top == -1) {
//             System.out.println("Stack Underflow");
//             return -1; // Or throw exception
//         } else {
//             return arr[top--];
//         }
//     }

//     // Peek method
//     int peek() {
//         if (top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return arr[top];
//     }

//     // Check if stack is empty
//     boolean isEmpty() {
//         return top == -1;
//     }

//     // Print the stack
//     void printStack() {
//         if (top == -1) {
//             System.out.println("Stack is empty");
//             return;
//         }
//         System.out.print("Stack: [");
//         for (int i = 0; i <= top; i++) {
//             System.out.print(arr[i]);
//             if (i < top) System.out.print(", ");
//         }
//         System.out.println("]");
//     }
// }
// public class Stackjava {
//     public static void main(String[] args) {
//         Stack st = new Stack(5);
//         st.push(10);
//         st.push(20);
//         st.push(30);

//         st.printStack();  // Stack: [10, 20, 30]

//         System.out.println("Top element: " + st.peek()); // 30

//         System.out.println("Popped: " + st.pop()); // 30
//         st.printStack();  // Stack: [10, 20]
//     }
// }

//Stach linkedlist//
// Node class
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// // Stack using LinkedList
// class Stack {
//     Node top;

//     // Constructor
//     Stack() {
//         this.top = null;
//     }

//     // Push method
//     void push(int data) {
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//     }

//     // Pop method
//     int pop() {
//         if (top == null) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }
//         int popped = top.data;
//         top = top.next;
//         return popped;
//     }

//     // Peek method
//     int peek() {
//         if (top == null) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return top.data;
//     }

//     // Check if stack is empty
//     boolean isEmpty() {
//         return top == null;
//     }

//     // Print the stack
//     void printStack() {
//         if (top == null) {
//             System.out.println("Stack is empty");
//             return;
//         }
//         System.out.print("Stack: [");
//         Node current = top;
//         while (current != null) {
//             System.out.print(current.data);
//             if (current.next != null) System.out.print(", ");
//             current = current.next;
//         }
//         System.out.println("]");
//     }
// }
// public class Stackjava {
//     public static void main(String[] args) {
//         Stack st = new Stack();
//         st.push(10);
//         st.push(20);
//         st.push(30);

//         st.printStack();  // Stack: [30, 20, 10]

//         System.out.println("Top element: " + st.peek()); // 30

//         System.out.println("Popped: " + st.pop()); // 30
//         st.printStack();  // Stack: [20, 10]
//     }
// }

//682. Baseball Game leetcode//

import java.util.Stack;

public class Stackjava {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        String[] operations = {"5", "2", "C", "D", "+"};

        // Call the method and print the result
        int result = solution.calPoints(operations);
        System.out.println("Total Score: " + result);
    }
}

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String ops : operations){
            if(ops.equals("+")){
                int sum1 = stack.pop();
                int sum2 = stack.peek();
                stack.push(sum1);
                stack.push(sum1 + sum2);
            }
            else if(ops.equals("D")) stack.push(stack.peek()*2);
            else if(ops.equals("C")) stack.pop();
            else {stack.push(Integer.valueOf(ops));}
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
