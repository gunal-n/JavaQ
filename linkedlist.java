
import java.util.Scanner;


// //Linkedlist insert and display//
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    void display(){
//      Node temp = head;
//      while(temp != null){
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//      }
//    }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);
//         list.display();
//     }
// }

//User input by loop//


// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    void display(){
//      Node temp = head;
//      while(temp != null){
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//      }
//    }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         for(int i = 1; i <= n; i++){
//             list.insert(i);
//         }
//         list.display();
//     }
// }

//user input element//

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SLL{
   Node head;
   void insert(int data){
      Node newnode = new Node(data);
      newnode.next = head;
      head = newnode;
   }
   void display(){
     Node temp = head;
     while(temp != null){
        System.out.println(temp.data + " ");
        temp = temp.next;
     }
   }
}

public class linkedlist {
    public static void main(String[] args) {
        SLL list = new SLL();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++){
            list.insert(arr[i]);
        }
        list.display();
    }
}

