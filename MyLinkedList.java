public class MyLinkedList<L> {
    Node<L> head;

    public class Node<L> {
        L data;
        Node<L> next;

        Node(L data) {
            this.data = data;
        }
    }

    public boolean add(L data) {

        Node<L> newNode = new Node<L>(data);
        if (head == null) {
            head = newNode;
            return true;
        }

        Node<L> temp = head;
        newNode.next = temp;
        head = newNode;

        return true;
    }

    public void search(L data) {
        if (head == null) {
            return;
        }
        int index = 0;
        Node<L> temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return;
            }
            index++;
            temp = temp.next;
        }
    }

    public Node GetNode(int data) {
        return new Node(data);
    }

    public Node Insert(Node headNode, int position, int data) {
        Node head = headNode;
        if (position < 1)
            System.out.print("Invalid position");

        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = headNode;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    Node newNode = GetNode(data);

                    newNode.next = headNode.next;

                    headNode.next = newNode;
                    break;
                }
                headNode = headNode.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }

    public void print(Node node) {

        while (node != null) {
            if (node.next != null) {
                System.out.print(node.data + " ===> ");
            } else {
                System.out.println(node.data);
            }
            node = node.next;

        }
        System.out.println();
    }
}

