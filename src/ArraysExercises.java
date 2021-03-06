import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // Use '.toString', because numbers points to a location in memory; not the actual array.
        System.out.println(Arrays.toString(numbers));

        // Create a Person array that holds three Person objects:
        Person[] people = new Person[3];
        // elements will be empty (null by default)
        System.out.println(Arrays.toString(people));

        // Create three Person objects &
        // Assign Person objects to people:
        people[0] = new Person("Mike");
        people[1] = new Person("Eva");
        people[2] = new Person("Skye");

        // Iterate through 'people' array and print each:
        // EX1
        for (Person person : people) {
            System.out.println(person.getName());
        }
        // EX2
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        // Create a fourth Person object:
        Person person4 = new Person("Louie");

        // Use 'addPerson' method to add to array
        Person[] newArray = Person.addPerson(people, person4);

        // Iterate through 'newArray':
        for (Person person : newArray) {
            System.out.println(person.getName());
        }

    }

}

