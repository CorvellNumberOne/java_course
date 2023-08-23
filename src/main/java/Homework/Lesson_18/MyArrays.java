
package Homework.Lesson_18;


public class MyArrays {
    
    
    public static int[] sortirovka(int [] array){
        int a;
        

        for (int i = 0; i < array.length; i++) {
            
            int min = array[i]; //

            int index = i;//2
            
            for (int j = i+1; j < array.length ; j++) {

                if (array [j] < min) {
                    min = array[j];
                    index = j;
                }
            }
//          Если индексы не равны - меняем текущему индексу значение на меньшее
            if (i != index) {
//              Индекс i уходит в буфер (а)
                a = array[i];
//              Текущий индекс меняется на индекс с меньшим значением
                array[i]=min;
                
//              Меньший индекс становится индексом i
//
                array[index]=a;
            }
        }
        return array;

    }
    
    public static void main(String[] args) {
        int [] array  = {-5,4,36,-83,24,103};
        
        sortirovka(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        
    }
}

/* 
0. Создаем переменную а, которая будет хранить порядковый индекс массива

1. Генерим индекс массива в цикле и записываем значения из ячейки с индексом 
и порядковый текущий индекс в соответствующие переменные index и min.

2. Второй цикл генерит следующий индекс (текущий индекс +1) и сравнивает 
значения из двух циклов. Если значение следующего индекса (j)
меньше текущего (i), тогда переопредели переменную min (хранит значение) 
и поменяй индекс (index) из первого цикла на значения и индекс из второго цикла.

3. Если индексы, который генерит первый цикл, отличается от переменной index
которую определяет также первый цикл, тогда мы присваиваем текущему индексу 
(i=min)новое меньшее значение, а затем меняем его индекс на новый.
    

Переменные:
а - Принимает меньшее значение (буфер)
index - принимает мешьший индекс
min - принимает меньшее значение
--------------------------------------------------------------------------------

1. Получить индекс через первый цикл 
2. Присвоить значение и индекс переменным внутри первого цикла(index, min)
3. Генерим следущий индекс через второй цикл
4. Сравнить значения в памяти индекса начиная с нуля и значения индекса на 1 больше:
   Отличаются - записываем второй индекс и его значения в переменные первого цикла (index, min - имееют мешьшее значение)
5. Если отличаются значения первого цикла и индекс с его переменными (index, min) - в переменную а
записываем индекс первого цикла, первому циклу присваиваем меньшее значение из
второго цикла, и меньшее значение (из второго цикла) будет равно текущему индексу (i)


*/