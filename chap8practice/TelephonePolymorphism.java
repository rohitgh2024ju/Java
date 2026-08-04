package chap8practice;

public class TelephonePolymorphism {
    public static void main(String[] args) {
        
    }
}

abstract class Telephone {
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}



class Smartphone extends Telephone {
    @Override
    public void ring() {
        System.out.println("smartphone is ringing...");
    }
    @Override
    public void lift() {
        System.out.println("smartphone is lifted...");
    }
    @Override
    public void disconnect() {
        System.out.println("smartphone is disconnected...");
    }
    
}