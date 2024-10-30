package Lab5;
import Lab3.MyDoubleLinkList;

public class MyQueue<T> extends MyDoubleLinkList<T> {
    
    public void EnQueue(T toAdd){
        this.append(toAdd);
    }

    public T DeQueue(){
        return this.removeEnd();
    }

    public T peek() throws Exception{
        if(this.getSize() == 0){
            throw new Exception("You are pointing at null");
        }
        return this.tail.held;
    }

    //get Size is already inheritied from My double linklist class and is protected

    public boolean isEmpty(){
        if(this.getSize() == 0){return true;}
        return false;
    }

}
