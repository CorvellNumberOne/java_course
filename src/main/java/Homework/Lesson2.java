
package Homework;

//Урок 2 типы данных: 
//Создать по 4 переменных каждого типа данных, в различных системах счисления:
//Двоичная, восьмиричная, десятичная, шеснадцатиричная.

public class Lesson2 {
    public static void  main (String [] args) {
        
        byte b1=0b1100; 
        byte b2=0_14;
        byte b3=12;
        byte b4=0xc;
        
        short s1=-0b010100010100;
        short s2=-0_2424;
        short s3=-1300;
        short s4=-0x514;
        
        
        int i1=0b0;
        int i2=0_0;
        int i3=0;
        int i4=0x0;
        
        long l1=0b111010110111100110100010101L;
        long l2=0_726746425L;
        long l3=123_456_789L;
        long l4=0x75bcd15L;
        
//      Тип данных float, ставь букву f в конце значения.
        float f1=3.14f;
        float f2=3.23F;
        
//      Тип данных double, букву d можно не ставить.
        double d1=5233666.69d;
        double d2=5233666.69;
        
        boolean bool1=true;
        boolean bool2=false;
        
//      Тип данных char можно выводить в различных системах счислений
        char ch='©';
        char ch1=169;
        char ch2=0b0000000010101001;
        char ch3=0_251;
        char ch4=0xa9;
        
    
        System.out.println(ch);
    }   
}
