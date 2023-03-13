public class MyNode<K> {
    private K key;
    private MyNode next;

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }

    public MyNode(K key){
        this.key = key;
        this.next = null;
    }
}
