package chap7practice;

public class RectangleInheritance {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5f, 6f, 7f);

        System.out.println(cuboid.areaRectangle());
        System.out.println(cuboid.areaCuboid());
    }
}

class Rectangle {
    float length;
    float width;

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float areaRectangle() {
        return length * width;
    }
}

class Cuboid extends Rectangle {
    float depth;

    Cuboid(float length, float width, float depth) {
        super(length, width);
        this.depth =depth;
    }

    public float areaCuboid() {
        return areaRectangle() * this.depth;
    }
}