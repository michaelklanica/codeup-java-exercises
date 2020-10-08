import java.util.Arrays;

public class Person {

    private String name;
    // Create Person class inside of src that has a private name property that is a string.

    // The class should have a constructor that accepts a `String` value and sets the person's name to the passed
    // string.
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        //TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
        //TODO: print a message to the console using the person's name
        System.out.println(this.name + " says \"hello.\"");
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        newPeopleArray[newPeopleArray.length - 1] = newPerson;
        return newPeopleArray;
    }


    // Create a `main` method on the class that creates a new `Person` object and tests the above methods.
    public static void main(String[] args) {
        Person mike = new Person("michael");

        System.out.println(mike);
        System.out.println(mike.getName());
        mike.setName("Michael");
        mike.sayHello();

        // 'person1' created.
        Person person1 = new Person("John");
        // 'person2' created.
        Person person2 = new Person("John");
        // values of 'person1.getName()' and 'person2.getName()' are equal
        System.out.println("value of 'person1.getName()': " + person1.getName());
        System.out.println("value of 'person2.getName()': " + person2.getName());
        System.out.println("Are the values equal? " + person1.getName().

                equals(person2.getName()));
        // 'person1' and 'person2' point to two different reference IDs, because they are each an instance of
        // the Class Person
        System.out.println("value of 'person1': " + person1);
        System.out.println("value of 'person2': " + person2);
        System.out.println(person1 == person2);

        // 'person3' created.
        Person person3 = new Person("John");
        // 'person4' points to the same reference ID as 'person3'
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

}
