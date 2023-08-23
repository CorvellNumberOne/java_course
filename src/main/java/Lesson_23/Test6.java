
package Lesson_23;


public class Test6 {
    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showInfoAboutAmimal();
        a.showInfoAboutMouse();
    }
}

class Animal {
    String showName(){
        return "Some animal";
    }
    
    void showInfoAboutAmimal(){
        System.out.println("Name of mouse: " + showName());
    }
}

class Mouse extends Animal{
    @Override
    String showName(){
        return "Jerry";
    }
    
    void showInfoAboutMouse(){
        System.out.println("Name of animal: " + showName());
    }
}