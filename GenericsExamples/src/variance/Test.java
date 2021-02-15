package variance;
import arrOfGenericTypeDerrivedFromComparable.Para;
public class Test {

    static void process(Para<? extends  Person, ? extends Person> p ) {
        Person person = p.getFirst();
        System.out.println(person.getClass());
        Employee emp = (Employee) p.getFirst();
        System.out.println(p.getLast().getClass());
//        p.setFirst(new Person("a"));
    }

    static void process2(Para<? super Manager, ? super Manager> p) {
     Object pFirst = p.getFirst();
    }

    static void process3(Para<? extends  Person, ? extends Manager> p ) {
        Person person = p.getFirst();
    }


    public static void main(String[] args) {
        Para<Employee, Person> personPara = new Para<>(new Employee("n"), new Person("a"));
        Test.process(personPara);
    }

    static Para<? super Manager, ? super Manager>
    copy(Para<? extends Employee, ? extends Employee> src, Para<? super Manager, ? super Manager> dest) {
        dest.setFirst((Manager) src.getFirst());
        dest.setLast((Manager) src.getLast());
        return dest;
    }

}
