package Stack;

public class Node <K> {
    public Node next;
    K data;

    public Node(K d, Node n){
        this.data = d;
        this.next =n;

    }
}
