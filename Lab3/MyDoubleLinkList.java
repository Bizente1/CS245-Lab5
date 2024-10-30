package Lab3;

public class MyDoubleLinkList<T>{

    protected Node<T> head;
    protected Node<T> tail;
    protected int size;

    protected MyDoubleLinkList(){
        head = null;
        tail = null;
        size = 0;}

    protected void append(T newObject){
        Node<T> newNode = new Node<T>(newObject);
        if(size == 0){
            this.head = this.tail = newNode;
        }else{ 
         Node<T> oldHead = this.head;
         this.head = newNode;
         this.head.next = oldHead;
         oldHead.prev = this.head;}
        
         size++;}

    protected void addToMid(T newObject, int index){
        if(index < 0 ||index > this.size){
            throw new IndexOutOfBoundsException("This Index is not in the size of the Link List");}
        if(index==0){this.append(newObject);}else if(index == this.size){this.appendToEnd(newObject);}else{

        Node<T> newNode = new Node<T>(newObject);    
        Node<T> temp = this.head;
        for(int i=0;i < index-1;i++){
            temp = temp.next;}
        newNode.next = temp.next;
        newNode.prev = newNode.next.prev;
        newNode.prev.next = newNode;
        size++;}}

    protected void appendToEnd(T newObject){
        Node<T> newNode = new Node<T>(newObject);
        if(size == 0){this.head = this.tail = newNode;
        size++;}else{

        this.tail.next = newNode;
        newNode.prev =  this.tail;
        this.tail = newNode;
        size++;}}

    protected  T removeFront(){
        if(this.size == 0){throw new IndexOutOfBoundsException("This List is empty");}
        if(this.size == 1){
            T toReturn = this.head.held;
            head = tail = null;
            size--;
            return toReturn;}
        T toReturn = this.head.held;   
        this.head.next.prev = null;
        this.head = this.head.next;
         size--;
        return toReturn;}

    protected T removeEnd(){
        if(this.size == 0){throw new IndexOutOfBoundsException("This List is empty");}
        if(this.size == 1){
            T toReturn = this.head.held;
            head = tail = null;
            size--;
            return toReturn;}
        T toReturn = this.tail.held;
        this.tail.prev.next = null;
        this.tail = this.tail.prev;
        size--;
        return toReturn;}

    protected boolean removeFirstValue(T toRemove){
        Node<T> temp = this.head;
        while(temp != null){
            if(temp.held.equals(toRemove)){
                if(temp.prev == null){
                    this.head = temp.next;
                    temp.next.prev = null;
                    size--;
                    return true;}
                if(temp.next == null){
                    this.tail = temp.prev;
                    temp.prev.next = null;
                    size--;
                    return true;}
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
            return true;}
            temp = temp.next;}
        return false;}

    protected boolean removeByIndex(int index){
        if(index < 0 ||index >= this.size){
            throw new IndexOutOfBoundsException("This Index is not in the size of the Link List");}
            if(index == 0){
                this.removeFront();
                return true;}
            if(index == size -1){
                this.removeEnd();
                return true;
            }
        Node<T> temp = this.head;
        for(int i=0; i< index; i++){temp = temp.next;}    
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    return true;}

    protected void set(T newObject, int index){
        if(index < 0 ||index >= this.size){
            throw new IndexOutOfBoundsException("This Index is not in the size of the Link List");}
        
        Node<T> temp = this.head;
        for(int i = 0; i < index; i++){
            temp = temp.next;}
        temp.held = newObject;
        }
       
        protected boolean checkIfVal(T val){
        Node<T> temp = this.head;
        for(int i = 0; i < this.size; i++){
            if(temp.held.equals(val)){return true;}
            temp = temp.next;}
        return false;}

        protected int getSize(){return this.size;}

    public String toString(){
        String toReturn = "(";
        if(size > 0){
        toReturn = toReturn + this.head.held.toString();
        Node<T> temp = this.head;
        for(int i=1;i<this.size;i++){
            temp =temp.next;
            toReturn = toReturn + ", " + temp.held.toString();}}
    return toReturn + ")";
    }







}