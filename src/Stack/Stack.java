package Stack;

public interface Stack<K>{
    public int size();
    public boolean isEmpty();
    public void push(K elem);
    public K pop();
    public void print();
    public K peek();
}
