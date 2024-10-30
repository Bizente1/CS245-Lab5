package Lab5;

public class Node<T>{
    
    public T held;
    public Node<T> next;
    public Node<T> prev;

    Node(T toHold){
        this.held = toHold;
        this.next = null;
        this.prev = null;}

    


}