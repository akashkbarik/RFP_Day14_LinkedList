public class main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
            MyLinkedList.Node head = myLinkedList.GetNode(56);
            head.nextNode = myLinkedList.GetNode(70);

            System.out.print("Linked list before insertion: ");
            myLinkedList.PrintList(head);

            int data = 30, pos = 2;
            head = myLinkedList.Insert(head, pos, data);
            System.out.print("Linked list after insertion of 30 at position " +pos+" : ");
            myLinkedList.PrintList(head);
        }
    }
