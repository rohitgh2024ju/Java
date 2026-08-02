package chap6practice;

public class ClassEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Rohit", 100000);
        System.out.println(emp.getName() + emp.getSalary());
        
        emp.setName("Revu");
        System.out.println(emp.getName() + emp.getSalary());
    }
    
}

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

}
