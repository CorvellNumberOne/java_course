
package Homework.Lesson_20;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;



public class Test {
    public static void abc (String ... a){
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String b:a){
            list.add(b);
        }
        Collections.sort(list);
        System.out.println(list.toString());
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        Test.abc("Hi", "bye", "Yo","-10","199","!@#$", "ABC");
    }
} 
