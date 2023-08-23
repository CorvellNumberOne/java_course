
package Lesson_25;


public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
//      Произошел автоматический widening из byte в int
//        int a = b;
//        
//        int i1=3;
//        short s2=(short)i1;
//         byte b2 = 127;
//         short s1 = 5000;
//         char c1 = 100;
//         
//         long l1 = 1;
//         int i2 = (int)l1;
//         
//         int i10=10000;
//         short s10 = (short)i10;
//         
//        char c10 = (char)-8;
//        
//        System.out.println(c10);
//        
//        boolean b10 = true;
//        int i12 = (int)3.14;
//        
        int i = 5;
        long l = 10;
//      Кастим на int
        i=(int)(i*l);
        
        i = (int)(i*l);
        
        float f = 3.14f;
        int i2 = 10;
        
//      Эти ребята конвертируются в int с африфмети операциями
        byte z = 3;
        short x = 4;
        char y = 5;
        
//      
        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.1;
//      Конечный тип данных будет double, так как надо привести все
//      к одному типу данных.
        double i5 = b2+f2+d2;
        
        double d10 = 3.14;
        float f10 = 6.28f;
        
        
        System.out.println(i);
        System.out.println(f+i2);
        System.out.println(z+x+y);
    }
}
