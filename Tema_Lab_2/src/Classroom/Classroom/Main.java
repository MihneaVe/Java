package Classroom;

public class Main {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[6];

        // Create 6 students (could be made with a loop and reading from a file but for the sake of simplicity they are hardcoded) 
        students[0] = new Student("John", 20, new Adresa("Strada1", 1, "Oras1", "Tara1"), 1, 1, new float[][]{{1,2,5,4}, {1,5,3}, {7,9,3}, {8,9,10}});
        students[1] = new Student("Jane", 21, new Adresa("Strada2", 2, "Oras2", "Tara2"), 2, 2, new float[][]{{6,4}, {7,8}, {8,10,8}, {9,10}});
        students[2] = new Student("Jack", 22, new Adresa("Strada3", 3, "Oras3", "Tara3"), 3, 3, new float[][]{{7,6}, {8,9,10}, {9,10,7}, {10,8,2}});
        students[3] = new Student("Jill", 23, new Adresa("Strada4", 4, "Oras4", "Tara4"), 4, 4, new float[][]{{8, 7}, {9, 8}, {10, 9}, {10, 9}});
        students[4] = new Student("Jim", 24, new Adresa("Strada5", 5, "Oras5", "Tara5"), 5, 5, new float[][]{{9, 8}, {10, 9}, {10, 9}, {10, 9}});
        students[5] = new Student("Jill2", 25, new Adresa("Strada6", 6, "Oras6", "Tara6"), 6, 6, new float[][]{{10, 9}, {10, 9}, {10, 9}, {10, 9}});

        // Print the situation of each student
        for(int i=0; i<6; i++){
            students[i].getSituationship();
        }

        // Print the top 3 students
        Student.Top3Students(students);

    }
}
