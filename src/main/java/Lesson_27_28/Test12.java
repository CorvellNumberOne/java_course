
package Lesson_27_28;


public class Test12 {
    void abc(){
        int [] array = {1,2,3};

        
        try{
            System.out.println(array[7]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            String s = null;
            try{
                System.out.println(s.length()); 
            }
            catch(NullPointerException e1){
                System.out.println("Poiman "+e);
            }
            
        }
        
        
    }
    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }
}
