package Lab5;

public class MyQueue<T> extends MyDoubleLinkList<T> {
    
    public void EnQueue(T toAdd){
        this.append(toAdd);
    }

    public T DeQueue(){
        return this.removeEnd();
    }

    public T peek(){
        return this.tail.held;
    }

    //get Size is already inheritied from My double linklist class and is protected

    public boolean isEmpty(){
        if(this.getSize() == 0){return true;}
        return false;
    }

}
