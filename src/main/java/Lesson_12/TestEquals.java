
package Lesson_12;


public class TestEquals {
    
/*
    
    void maximum (int i1, int i2, int i3){
        if(i1>i2 && i1>i3){
            System.out.println("Максимум - "+ i1);
        }
        else if(i2>i3 && i2>i1){
            System.out.println("Максимум - "+ i2);
        }
        else{
            System.out.println("Максимум - "+ i3);
        }
    }
*/
    
    void abc (){
        String str;
        int a = 10;
        if (a>=10)
            str = "Privet";
        if (a<10)
            str = "Poka";
        else
            str = null;
        
        System.out.println(str);
    }
    
    
    public static void main(String[] args) {
        TestEquals t1 = new TestEquals();
//        t1.maximum(4, 7, 0);
        int a = 10;
        int b = 20;
        int maximum = (a>b)?a:b;
        System.out.println(maximum);
    }
}
