
package Lesson_19;

public class Test5 {
    public static void main(String[] args) {
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"math analys", "philosophy"};
        
        for(String s1:students){
            for(String s2: exams){
                System.out.println(s1+" "+s2);
            }
        }
    }
}
/*
    Работает так:
    1.s1 = ivanov
    2 s2 = mat analys
    3 Вывод на экран
    4 Внутриенний цикл потовряется
    5 s1 по прежнему Ivanov
    6 так как это цикл s1 остался как есть, s2 работает дальше. s2 = philosophy
    7 вывод на экран
    8 цикл повторяется
    9 s1 = Petrov
    10 s2= math analys
    11 вівод на экран
    12 цикл повторяется
    

*/