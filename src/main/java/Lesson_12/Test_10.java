package Lesson_12;

public class Test_10 {

    public static void main(String[] args) {

        int salary = 400;
        
        if (salary<200){
            System.out.println("ЗП очень низка");
        }
        else if (salary<400){
            System.out.println("ЗП среднего размера");
        }
        else if (salary<600){
            System.out.println("ЗП высокая");
        }
        else
            System.out.println("ЗП отличная!");
    }
}
