public class Person {

    public static void main(String[] args) {
        Person mike = new Person("Mike Klanica");

//        System.out.println(mike);
//        System.out.println(mike.getName());
//        mike.setName("Michael");
//        mike.sayHello();

        // 'person1' created.
        Person person1 = new Person("John");
        // 'person2' created.
        Person person2 = new Person("John");
        // values of 'person1.getName()' and 'person2.getName()' are equal
        System.out.println("value of 'person1.getName()': " + person1.getName());
        System.out.println("value of 'person2.getName()': " + person2.getName());
        System.out.println("Are the values equal? " + person1.getName().equals(person2.getName()));
        // 'person1' and 'person2' point to two different locations in memory, because they are each an instance of
        // the Class Person
        System.out.println("value of 'person1': " + person1);
        System.out.println("value of 'person2': " + person2);
        System.out.println(person1 == person2);

        // 'person3' created.
        Person person3 = new Person("John");
        // 'person4' points to the same location in memory as 'person3'
        Person person4 = person3;
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person3 == person4);
        System.out.println(person3.getName());
        System.out.println(person4.getName());

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        // changing the value of name in person5 will change person6 as well, since both point to the same memory
        // location.
        person5.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

    }



    public Person(String personName) {
        name = personName;
    }

    private String name;

    public String getName() {
        //TODO: return the person's name
        return name;
    }

    public void setName(String name) {
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
        //TODO: print a message to the console using the person's name
        String name = getName();
        System.out.println(name + " says \"hello.\"");
    }
}
