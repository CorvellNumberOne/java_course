package Lesson_19;

public class Test7 {

    public static void main(String[] args) {
        

        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array2 = {sb1, sb2, sb3};
        
        for(StringBuilder sb : array2){
            sb.append("Ukarine ponad oose");
        }
        
/*      Элементы не мопеняли свое значение из-за зоны видимости переменной а
        for(int a:array){
            a=3;
        }
*/      
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] +" ");
        }

    }
}
