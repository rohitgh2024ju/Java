package chap8practice;

public class AbstractPen {
    public static void main(String[] args) {

        FountainPen pen = new FountainPen();

        pen.openCap();
        pen.refill();
        pen.write();
    }
}

abstract class Pen {
    abstract public void write();

    abstract public void refill();

    public void openCap() {
        System.out.println("Cap is opened");
    }
}

class FountainPen extends Pen {
    @Override
    public void write() {
        System.out.println("writing...");
    }

    @Override
    public void refill() {
        System.out.println("refiling...");
    }
}