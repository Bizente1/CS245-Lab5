package Lab5;
import java.util.Random;;

public class Driver {
    Shop shop;
    int simTicks;

    Driver(){
        this.shop = new Shop();
        this.simTicks = new Random().nextInt(500);
    }

    public static void main(String[] args){
        Driver testing = new Driver();
        testing.simulate(testing.simTicks);
    }

    private void simulate(int ticks){

    }

}
