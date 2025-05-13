
// class Node{
//      int data;
//      Node next;
//      Node(int data){
//         this.data = data;
//         this.next = null;
//      }
// }

// class SLL{
//     Node head;

//     void insert(int data){
//         Node newnode = new Node(data);
//             newnode.next = head;
//             head = newnode;
//         }

//         void delete(int position) {
//             if (head == null) {
//                 System.out.println("List is empty");
//                 return;
//             }
    
//             if (position == 0) {
//                 head = head.next;
//                 return;
//             }
    
//             Node temp = head;
//             for (int i = 0; i < position - 1 && temp != null; i++) {
//                 temp = temp.next;
//             }
    
//             if (temp == null || temp.next == null) {
//                 System.out.println("Position out of bounds");
//                 return;
//             }
    
//             temp.next = temp.next.next;
//         }

//     void display(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

// }

// public class a {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);
//         list.display();

//         list.delete(0);
//         list.delete(1);
//         list.delete(10);
//         list.display();
//     }
// }
//patten

// import java.util.Scanner;
// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++){
//             int num = i;
//             int diff = n - 1;
//             for(int j = 1; j <= i; j++){
//                 System.out.print(num + " ");
//                 num = num + diff;
//                 diff--;
//             }
//             System.out.println();
//         }

//     }
// }