package Stack;

public class LinkedStack <K> implements Stack <K>{
    Node head;
    Node tail;
    int s = 0;


    @Override
    public int size() {
        return s;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void push(K elem) {
        if (isEmpty()){
            head = new Node(elem,null);
            tail = head;
        }
        else{
            tail.next = new Node(elem,null);
            tail = tail.next;

        }
        s++;

    }
    public K pop(){
        K flag = null;

        if(!isEmpty()){
            Node temp = null;
            for(Node n = head; n.next!=null; n=n.next){
                temp = n;
            }
            flag = (K)tail.data;
            tail = temp;
            tail.next=null;
            s--;

        }
        else {
            throw new NullPointerException();
        }


        return flag;
    }
    public K peek(){
        K flag = null;
        if(!isEmpty()){
            flag = (K)tail.data;

        }
        return flag;
    }


    @Override
    public void print() {
        for(Node n = head; n!=null; n=n.next){
            System.out.print(n.data+"->");
        }

    }
}
