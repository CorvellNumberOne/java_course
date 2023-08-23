
package Homework;

public class BankAccount {
    
    int id;
    String name;
    double balance;
    
//  Создали метод, использовали созданные переменные без переопределения типа данных (balance) 
    double popolnenieScheta(double popolni){
        balance += popolni;
        return balance;
    }
    
    double snyatieSoCheta(double popolni){
        balance -= popolni;
        return balance;
    }
    
    public static void main(String[] args){

        BankAccount MyAccount = new BankAccount();
        MyAccount.id=1;
        MyAccount.name="Artem";
        MyAccount.balance=12.35;
        MyAccount.popolnenieScheta(3500);
        MyAccount.snyatieSoCheta(-1000);
        
        BankAccount YourAccount = new BankAccount();
        YourAccount.id=2;
        YourAccount.name="Oleg";
        YourAccount.balance=2.0;
        
        
        BankAccount HisAccount = new BankAccount();
        HisAccount.id=3;
        HisAccount.name="Oleg2";
        HisAccount.balance=7.99;
         
// id содержать все три переменные, поэтому нужно указывать конкретную
        
        System.out.println(HisAccount.balance);
        System.out.println(YourAccount.id);
        System.out.println(MyAccount.balance);
    }
}
