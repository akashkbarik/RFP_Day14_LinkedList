public class main {
    public static void main(String[] args) {
        MyLinkedList linkedlist = new MyLinkedList();
        linkedlist.add(56);
        linkedlist.print();
        linkedlist.add(30);
        linkedlist.print();
        linkedlist.add(70);
        linkedlist.print();
        linkedlist.popLast();
        linkedlist.print();
    }
}
