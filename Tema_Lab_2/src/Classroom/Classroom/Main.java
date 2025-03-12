package Classroom;

public class Main {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[6];

        students[0] = new Student("John", 20, new Adresa("Strada1", 1, "Oras1", "Tara1"), 1, 1, new int[]{1, 1, 7, 8});
        students[1] = new Student("Jane", 21, new Adresa("Strada2", 2, "Oras2", "Tara2"), 2, 2, new int[]{6, 7, 8, 9});
        students[2] = new Student("Jack", 22, new Adresa("Strada3", 3, "Oras3", "Tara3"), 3, 3, new int[]{7, 8, 9, 10});
        students[3] = new Student("Jill", 23, new Adresa("Strada4", 4, "Oras4", "Tara4"), 4, 4, new int[]{8, 9, 10, 10});
        students[4] = new Student("Jim", 24, new Adresa("Strada5", 5, "Oras5", "Tara5"), 5, 5, new int[]{9, 10, 10, 10});
        students[5] = new Student("Jill2", 25, new Adresa("Strada6", 6, "Oras6", "Tara6"), 6, 6, new int[]{10, 10, 10, 10});

        for(int i=0; i<6; i++){
            students[i].getSituationship();
        }

        Student.Top3Students(students);

    }
}
