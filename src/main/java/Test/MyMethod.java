
package Test;


public class MyMethod {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        int a = m1.sum();
        System.out.println(a);
    }

}

class MyClass{
    int a=2, b=4;
    
    int sum(){
        return a+b;
    }

}