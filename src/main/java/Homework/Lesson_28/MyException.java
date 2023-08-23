
package Homework.Lesson_28;


public class MyException {
    public static void main(String[] args) throws NeMyasoException{
        Tiger t = new Tiger();
        
            t.eat("myaso");
            
            try{
                t.drink("voda");
                try{
                    t.drink("pivo");
                }
                catch(NeVodaException e){
                    System.out.println(e);
                }
                finally{
                    System.out.println("This is inner finally block");
                }
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        

        
    }
}

class Tiger{
    void eat(String s) throws NeMyasoException{
        final String meat = "myaso";
        if (s.equals(meat)){
            System.out.println("Tigr est myaso!");
            
        }
        else
            throw new NeMyasoException("tigr ne est "+s);
    }
    
        void drink(String s) throws NeVodaException{
        final String voda = "voda";
        if (s.equals(voda)){
            System.out.println("Tigr p`et vodu!");
            
        }
        else
            throw new NeVodaException("tigr ne p`et "+s);
    }
    
    
}


class NeMyasoException extends RuntimeException{
    NeMyasoException(String s){
        super(s);
    }
}

class NeVodaException extends Exception{
    NeVodaException(String message){
        super(message);
    }
}


