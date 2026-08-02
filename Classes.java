public class Classes {

    public static void main(String[] args) {

        Student s = new Student("Rohit", "Mechanical");

        s.getDetails();
    }
}

class Student {

    String name;
    String dept;

    Student(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public void getDetails() {
        System.out.println("Hi, this is " + this.name +
                " and I am from the " + this.dept + " department.");
    }
}