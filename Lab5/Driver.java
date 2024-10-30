package Lab5;
import java.util.Random;;

public class Driver {
    Shop shop;
    int simTicks;
    Random random = new Random();

    Driver(){
        this.shop = new Shop();
        this.simTicks = random.nextInt(500);
    }

    public static void main(String[] args){
        Driver testing = new Driver();
        testing.simulate(testing.simTicks);
    }

    private void simulate(int ticks){
        for(int i=0; i <= simTicks; i++){
            if(random.nextBoolean()){
                this.shop.arrival(new Customer());
            }
            this.shop.process();
        }
        System.out.println(this.shop.totalProfit);
    }

}
