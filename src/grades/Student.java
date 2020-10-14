package grades;

//Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    Student (String studentName){
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int grade : this.grades) {
            total += grade;
        }
        return total / this.grades.size();
    }

}
