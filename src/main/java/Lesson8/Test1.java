
package Lesson8;


public class Test1 {
//  Модификатор final делает невозможным изменения переменной. Only read
    
//  Instance переменная (константа)
    public final int a;
    
    Test1(){
        a=10;
    }
    
    Test1(boolean b){
        a=15;
    }
    
    
//  Параметры метода тоже могут иметь final modifier
    public void abc(final short s){
//      Переменная типа byte b не видна вне метода abc (local переменная)
        final byte b;
        b=10;
        System.out.println(s + b);
    }
    
    
    
    public static void main(String[] args) {
        Test1 t = new Test1();
//      У переменной а есть модификатор final (не можем ее изменить)
//      t.a = t.a*2;
        System.out.println(t.a);
    }
    
}
