
package Lesson_27_28;

import java.util.*;
public class Test16 {
    
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        System.out.println(5/0);
        
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Employee [] array1 = {d,t};
////      Тут ошибка кастинга
////        Teacher t2 = (Teacher)array1[0];
//        Teacher t3 = new Teacher();
//        Teacher [] array2 = {t,t3};
        Test16.createPswrd("erevjn");
        Samolet s = new Samolet();
        s.ojidat();
        s.letet();
        s.otmenitPolet();
    }
    
//    Проверка пароля
    public static void createPswrd(String pswrd){
        if(pswrd.length() < 6){
            throw new IllegalArgumentException("Dlinna parolya malenkaya");
        }
        if(pswrd.length() > 12){
            throw new IllegalArgumentException("Dlinna parolya bolshaya");
        }
        System.out.println("Parol prinyat");
    }
}

class Employee{}

class Doctor extends Employee{}

class Teacher extends Employee{}

class Samolet{
    
    String sostoyanie = "V oszhidanii";
    
    public void letet(){
        sostoyanie = "v vozduhe";
        System.out.println("samolet letit");
    }
    public void ojidat(){
        if(sostoyanie.equals("v vozduhe"))
            throw new IllegalStateException("Samolet uzhe v vozduhe");
        sostoyanie = "v ozhidanii";
        System.out.println("samolet v ozhidanii polete");
    }
    
    public void otmenitPolet(){
        if(sostoyanie.equals("v vozduhe"))
            throw new IllegalStateException("Samolet uzhe v vozduhe");
        sostoyanie = "polet otmenen";
        System.out.println("Polet otmenen");
    }
}