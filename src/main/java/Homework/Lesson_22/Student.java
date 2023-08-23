
package Homework.Lesson_22;


public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        
        StringBuilder sb1 = new StringBuilder(this.name);
        System.out.println(this.name);
        return sb1;
    }

    public void setName(StringBuilder name) {
        if(name.length()>1)
            this.name = name;
        else
            System.out.println("Длина имени должна быть не менее 2-х символов");
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if(course>0 && course<5)
            this.course = course;
        else
            System.out.println("Курс от 1 до 4");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade>0 && grade<11)
            this.grade = grade;
        else
            System.out.println("Диапазон оценок от 1 до 10");
    }
    
    public void showInfo(){
        System.out.println("Имя студента: " + name);
        System.out.println("Курс: "+ course);
        System.out.println("Оценка: " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Борат Маргарет Сагдиев"));
        s.setGrade(9);
        s.setCourse(3);
        
        s.showInfo();
        
        
        
        
    }
    
    
}
