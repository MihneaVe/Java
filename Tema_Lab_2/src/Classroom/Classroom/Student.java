package Classroom;

import java.util.Arrays;
import java.util.Comparator;

public final class Student extends Person {
    private int studyYear;
    private int studyGroup;
    private float[][] gradesPerDiscipline = new float[4][];

    // Constructor
    public Student(String string, int i, Adresa adresa, int j, int k, float[][] ls) {
        super(string, i, adresa);
        this.studyYear = j;
        this.studyGroup = k;
        this.gradesPerDiscipline = ls;
    }

    // Getters from README.md
    public float getYearAverage() {
        float sum = 0;
        for (int i = 0; i < 4; i++) {
            float media = 0;
            for (int j=0; j<gradesPerDiscipline[i].length; j++){
                media += this.gradesPerDiscipline[i][j];
            }
            media /= gradesPerDiscipline[i].length;
            sum += media;
        }
        return sum / 4;
        }

        public void getSituationship() {
            System.out.println("The student " + this.getName() + " part of class " + this.studyGroup + " has an average of " + Math.round(this.getYearAverage()) + " and is in year " + this.studyYear + " of study.");
        
            boolean hasEnoughGrades = true;
            for (int i = 0; i < 4; i++) {
                if (this.gradesPerDiscipline[i].length < 2) {
                hasEnoughGrades = false;
                break;
                }
            }
            
            if (this.getYearAverage() >= 5 && hasEnoughGrades) {
                System.out.println("The student " + this.getName() + " has passed the year.\n");
            } else {
                System.out.println("The student " + this.getName() + " has NOT passed the year.\n");
            }
        }

    // Method to print the top 3 students
    public static void Top3Students(Student[] students) {
        // Sort students by their average grade in descending order
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Float.compare(s2.getYearAverage(), s1.getYearAverage());
            }
        });

        // Print the top 3 students
        System.out.println("Top 3 students:");
        for (int i = 0; i < 3 && i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getName() + " with an average of " + Math.round(students[i].getYearAverage()));
        }
    }

}