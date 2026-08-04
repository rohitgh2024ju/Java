package chap8practice;

public class MonkeyInheritance {
    public static void main(String[] args) {
        Human h = new Human();

        h.jump();
        h.bite();
        h.eat();
        h.sleep();
    }
}

class Monkey {
    public void jump() {
        System.out.println("monkey is jumping...");
    }

    public void bite() {
        System.out.println("monkey is biting...");
    }
}

class Human extends Monkey implements BasicAnimal {

    @Override
    public void jump() {
        System.out.println("human is jumping...");
    }

    @Override
    public void bite() {
        System.out.println("human is biting...");
    }

    @Override
    public void eat() {
        System.out.println("human is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("human is sleeping...");
    }

}

interface BasicAnimal {
    void eat();

    void sleep();
}