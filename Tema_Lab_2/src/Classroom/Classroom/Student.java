package Classroom;

public final class Student extends Person {
    private int studyYear;
    private int studyGroup;
    private int[] gradesPerDiscipline = new int[4];

    public Student(String string, int i, Adresa adresa, int j, int k, int[] ls) {
        super(string, i, adresa);
        this.studyYear = j;
        this.studyGroup = k;
        this.gradesPerDiscipline = ls;
    }

    public int getYearAverage() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += gradesPerDiscipline[i];
        }
        return sum / 4;
    }

    public void getSituationship(){
        System.out.println("The student " + this.getName() + "Part of class "+ this.studyGroup + " has an average of " + this.getYearAverage() + " and is in the " + this.studyYear + " year of study.");
        if (this.getYearAverage() >= 5) {
            System.out.println("The student " + this.getName() + " has passed the year.");
        } else {
            System.out.println("The student " + this.getName() + " has NOT passed the year.");
        }
    }


}