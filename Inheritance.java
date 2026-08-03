public class Inheritance {
    public static void main(String[] args) {
        Student rohit = new Student("Rohit", 21, 101);
        Teacher amit = new Teacher("Amit", 40, "Java");

        rohit.introduce();
        rohit.study();

        System.out.println();

        amit.introduce();
        amit.teach();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I am " + this.name + ".\n" + //
                "I am " + this.age + " years old.");
    }
}

class Student extends Person {
    int rollNumber;

    Student (String name, int age, int roll) {
        super(name, age);
        this.rollNumber = roll;
    }

    public void study() {
        System.out.println(this.name + " is studying.");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching " + subject + " .");
    }
}