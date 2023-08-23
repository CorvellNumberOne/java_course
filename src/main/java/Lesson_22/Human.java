package Lesson_22;

public class Human {

    public static void main(String[] args) {
        HumanTest hum1 = new HumanTest("male");
        hum1.setAge(+32);
        hum1.setName(new StringBuilder("Valera"));
        hum1.setWeight(50);
        hum1.setClever(false);
        
        System.out.println("Имя: " + hum1.getName());
        System.out.println("Возраст: " + hum1.getAge());
        System.out.println("Вес : " + hum1.getWeight());
        System.out.println("Человек разумный : " + hum1.isClever());

    }
}

class HumanTest {

//  Конструктор класса
    public HumanTest(String sex) {
        this.sex = sex;
    }

    final String sex;
    private StringBuilder name;
    private int age;
    private int weight;
    private boolean clever;

//  Делаем сеттеры (устанавливаем имя, возраст).
    public void setName(StringBuilder name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
    
    public void setClever(boolean clever){
        this.clever=clever;
    }

//  Делаем геттеры (Показывает имя, возраст). ПАРАМЕТРЫ не принимает
//  Для boolean не get, а is.
    
    public boolean isClever(){
        return clever;
    }
    
    
    public int getAge() {
        return age;
    }

    public StringBuilder getName() {
        StringBuilder sb1 = new StringBuilder(this.name);
        return sb1;
    }

    public int getWeight() {
        return weight;
    }

}
