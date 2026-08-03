package chap7practice;

public class CircleInheritance {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(12.f, 30f);

        System.out.println(cy.circleArea());
        System.out.println(cy.cylinderArea());
    }
    
}

class Circle {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    public float circleArea() {
        float pi = (float) Math.PI;

        return pi * radius * radius;
    }
}

class Cylinder extends Circle {
    float height;

    Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public float cylinderArea() {
        return circleArea() * height;
    }
}