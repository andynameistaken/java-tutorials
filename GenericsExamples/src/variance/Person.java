package variance;
class Person {
    String name;
    public Person(String n) { name = n; }
    public String toString() {
        return "Person [name=" + name + "]";
    }
}
class Employee extends Person {
    Employee(String n) { super(n); }
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}
class Manager extends Employee {
    Manager(String n) { super(n); }
    public String toString() {
        return "Manager [name=" + name + "]";
    }
}
