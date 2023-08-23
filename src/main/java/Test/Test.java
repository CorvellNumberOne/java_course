package Test;

public class Test {

    String car;
    String engine;
    int cost;

    Test(String car, String engine,int cost) {
        this.car = car;
        this.engine = engine;
        this.cost=cost;
    }
    
    void changes(String a, int b, String g){
       this.car=a;
       this.cost=b;
       changeEngine(g);
    }
    
    void changeEngine(String engine){
        this.engine=engine; 
    }
    
    public static void main(String[] args) {
        Test car1 = new Test("WV"," V6 turbo ",2500);
        System.out.println(car1.car + car1.engine + car1.cost);
        car1.changes("Opel", 6000," V8 ");
        System.out.println(car1.car + car1.engine+car1.cost);
    }

}
