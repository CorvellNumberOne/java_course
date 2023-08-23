
package Lesson_27_28;

// Создаем свои exceptions
public class Test15 {
    void marathon(int tempAir, int tempRun) throws PodvernutNoguException{
        if(tempRun>12){
            throw new PodvernutNoguException("temp bega to much: "+tempRun);
        }
        
        if(tempAir>32){
            throw new SveloNoguException();
        }
        
        System.out.println("Vy probezshali marafon");
    }
    
        public static void main(String[] args) {
        Test15 t = new Test15();
        try{
            t.marathon(20, 13);
        }
        catch(PodvernutNoguException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Vy poluchite gramotu");
        }
    }
}


class PodvernutNoguException extends Exception{
    
    PodvernutNoguException(String message){
        super(message);
    }
    PodvernutNoguException(){

    }
    

}

class SveloNoguException extends RuntimeException{
        SveloNoguException(String message){
        super(message);
    }
        
    SveloNoguException(){}
}