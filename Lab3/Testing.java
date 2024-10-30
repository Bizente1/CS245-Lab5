package Lab3;

public class Testing {
    
    public static void main(String[] args){
        MyDoubleLinkList<String> testing = new MyDoubleLinkList<String>();
        testing.append("Brother");
        testing.appendToEnd("Mother");
        testing.addToMid("Sister", 1);
        System.out.println(testing.getSize());
        System.out.println(testing.toString());
        testing.removeByIndex(1);
        System.out.println(testing.toString());
        testing.removeFront();
        System.out.println(testing.toString());
        testing.set("Father", 0);
        System.out.println(testing.toString());
        testing.appendToEnd("Son");
        System.out.println(testing.toString());
        testing.removeEnd();
        System.out.println(testing.toString());
        testing.appendToEnd("daughter");
        testing.append("daughter");
        System.out.println(testing.toString());
        testing.removeFirstValue("daughter");
        System.out.println(testing.toString());
    }
}
