
package Lesson_26;


public class Test6 {
//  Сначала срабатывает переменная, затем init, затем конструктор
    int a =3;
    
    Test6 (){
        a = 4;
    }
    
    {
        a=5;
    }
    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t.a);
        System.out.println("-------------------------------------------");
        C c = new C();
        
        System.out.println("-------------------------------------------");
        D d = new D();
        

    }
}

class A{
//  Статик константу можно определять внутри статик инициализатора
    static final int b;
    
    static {
        b=10;
    }
}

class B {
    static int c;
    static final int d;
    static final int e=1;
    static final int f;
    
    static {
        c=5;
        d=3;
//        e=2;
        f=0;
    }
}

class C {
    C(){
        System.out.println("Это конструтор");
    }
    String s = "ok";
    {System.out.println(s);}
    public static int i = 0;
    static{System.out.println(i);}
    {i=i+1; System.out.println(i);}

}

class D {
//  сначала работают static initialozators, потом non static init, потом конструтор
    static {abc(2);}
    static void abc(int a){
        System.out.println(a + " ");
    }
    
    D(){
        abc(5);
    }
    static {abc(4);}
    {abc(6);}
    
    static {new D();}
    {abc(8);}
}