package Lab5;

public class Shop {
    
    MyQueue<Customer> queue;
    int totalProfit;

    Shop(){
        this.queue = new MyQueue<Customer>();
        totalProfit = 0;
    }

    public void arrival(Customer customer){
        queue.EnQueue(customer);
    }

    public void process(){
        if(!queue.isEmpty()){
        totalProfit = this.queue.peek().cartValue;
        this.queue.DeQueue();
        }
    }


}
