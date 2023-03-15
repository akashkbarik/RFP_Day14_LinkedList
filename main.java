

public class main {
    public static void main (String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        MyLinkedList.Node head = myLinkedList.GetNode(56);
        head.next = myLinkedList.GetNode(30);


        System.out.print("Linked list before insertion: ");
        myLinkedList.print(head);

        int data =  40 , pos = 3;

        head = myLinkedList.Insert(head, pos, data);
        System.out.print("Linked list after insertion of 30 at position " +pos+" : ");
        myLinkedList.print(head);
    }
}
