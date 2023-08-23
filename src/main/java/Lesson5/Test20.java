
package Lesson5;


class Test19 {
    
//  Создаем метод  
    int summa(int a, int b, int c) {
        
//  Вот тут мы что то делаем с нашими данными
    int result = a+b+c;
    
//  Возвращаем результат
    return result;
    
    }
    
    int sredArif (int a1, int b1, int c1) {
    int result2 = summa(a1,b1,c1)/3;
    return result2;
    }
    
}

public class Test20{
    public static void main(String[] args) {
        Test19 t = new Test19();
        
//      Создаем переменную, приравниваем ее к методу и записываем параметры
        int summaTrexChisel = t.summa(1, 2, 3);
        summaTrexChisel++;
        
        System.out.println(summaTrexChisel);
        
//      Тут мы сразу выводим метод с параметрами        
        System.out.println(t.summa(10, 11, 12));
        
        System.out.println(t.sredArif(20,40,40)+"Privet");
    }
}