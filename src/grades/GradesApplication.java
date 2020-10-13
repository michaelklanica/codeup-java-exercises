package grades;

//Create a map for students and GitHub usernames:
//Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//Be creative! Make up GitHub usernames and grades for your student objects

//Create the command line interface:
//Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
//After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.


import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        //Create Student Objects
        Student student1 = new Student("Mike");
        student1.addGrade(100);
        student1.addGrade(80);
        student1.addGrade(60);
        Student student2 = new Student("Joe");
        student2.addGrade(90);
        student2.addGrade(70);
        student2.addGrade(50);
        Student student3 = new Student("Lee");
        student3.addGrade(85);
        student3.addGrade(75);
        student3.addGrade(65);
        Student student4 = new Student("Nate");
        student4.addGrade(55);
        student4.addGrade(45);
        student4.addGrade(25);

        // Create hashmap: key = Github username, value = Student Object
        HashMap<String, Student> students = new HashMap<>();
        students.putIfAbsent("mikeklanica", student1);
        students.putIfAbsent("joeperson", student2);
        students.putIfAbsent("anotherdude", student3);
        students.putIfAbsent("onemoreperson", student4);

        boolean response; // response to continue

        System.out.println("Welcome!\n\nHere are the Github usernames of our students: \n");
        for (String key : students.keySet()) {
            System.out.printf("| %s |", key);
        }
        System.out.println("\n\nWhich student would you like to see more information on?\n");
        Input input = new Input();
        String searchName = input.getString();
        do {
            if (!students.containsKey(searchName)) {
                System.out.println("Sorry, no student found with the Github username of " + searchName);
            } else {
                System.out.printf("Name: %s - Github Username: %s\n", students.get(searchName).getName(), searchName);
                System.out.printf("Current Average: %f\n\n", students.get(searchName).getGradeAverage());
            }
            response = input.yesNo();
        } while (!response);

        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}
