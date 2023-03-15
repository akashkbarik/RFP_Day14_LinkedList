public class MyLinkedList<L> {
     class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }
    }

     Node GetNode(int data) {
        return new Node(data);
    }

     Node Insert(Node headNode, int position, int data) {
        Node head = headNode;
        if (position < 1)
            System.out.print("Invalid position");

        if (position == 1) {
            Node newNode = new Node(data);
            newNode.nextNode = headNode;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    Node newNode = GetNode(data);

                    newNode.nextNode = headNode.nextNode;

                    headNode.nextNode = newNode;
                    break;
                }
                headNode = headNode.nextNode;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }

    void PrintList(Node node) {
        while (node != null) {
            if(node.nextNode!=null) {
                System.out.print(node.data + " ===> ");
            }else {
                System.out.println(node.data);
            }
            node = node.nextNode;
//            if (node != null)
//                System.out.println("");

        }
        System.out.println();
    }

}