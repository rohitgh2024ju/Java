package chap6practice;

public class ClassRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.5f, 15.6f);

        System.out.println(rect.perimeter());
        System.out.println(rect.area());
        System.out.println(rect.diagonal());
    }
}

class Rectangle {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float perimeter() {
        return 2 * (this.length + this.breadth);
    }

    public float area() {
        return this.length * this.breadth;
    }

    public float diagonal() {
        return (float) Math.sqrt(length * length + breadth * breadth);
    }
}