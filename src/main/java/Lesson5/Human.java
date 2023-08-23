
package Lesson5;

public class Human {
    public static void main(String[] args) {
        HumanPrmtrs h=new HumanPrmtrs();
        h.name="david";
        h.car=new Car3("Red","V8");
        h.bA=new BankAccount(007,102.58);
        h.info();
    }
}

class HumanPrmtrs {
    String name;
    Car3 car;
    BankAccount bA;
    
//  Создаем метод без параметров выводящий даныые про человека
    void info(){   
        System.out.println("Имя "+name+" цвет машины "+car.color+" Баланс "+bA.balance );
    } 
}

class Car3 {
    Car3(String c, String e){
      color=c;
      engine=e;
    }    
    String color;
    String engine;
}


class BankAccount {
    BankAccount (int id2, double balance2){
        id=id2;
        balance=balance2;
    }
    int id;
    double balance;
}