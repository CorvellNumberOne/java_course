package Homework.Lesson_22;

public class Animal {

    int eyes;

    Animal(int eyes) {
        this.eyes = eyes;
        type();
    }

    public void type() {
        System.out.println("Я животное");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void drink() {
        System.out.println("Животное пьет");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Хуячка");
        Cat cat = new Cat("Хуйотик");
        dog.play();
        cat.sleep();
        cat.jump();

    }
}

class Pet extends Animal {

    String name;
    int tail = 1;
    int paws = 4;

    Pet(String name) {
        super(2);
        this.name = name;
        typeOfPet();
    }

    public void typeOfPet() {
        System.out.println("Я домашний питомец");
    }

    public void run() {
        System.out.println("Животное бежит");
    }

    public void jump() {
        System.out.println("Животное прыгает");
    }
}

class Dog extends Pet {

    Dog(String name) {
        super(name);
        nameOfDog();
    }

    public void nameOfDog() {
        System.out.println("Я собачка по кличке " + name);
    }

    public void play() {
        System.out.println("Собачка играет");
    }
}

class Cat extends Pet {

    Cat(String name) {
        super(name);
        nameOfCat();
    }

    public void nameOfCat() {
        System.out.println("Я котик по кличке " + name);
    }

    public void sleep() {
        System.out.println("Кіт спить");
    }
}
