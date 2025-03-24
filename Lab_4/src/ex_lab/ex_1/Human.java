package ex_lab.ex_1;

import java.util.Date;

@SuppressWarnings("unused")
public class Human {
    
    private Date birthDate;

    private String name;

    private Brain brain;

    public Human(Date birthDate, String name, Brain brain) {
        this.birthDate = birthDate;
        this.name = name;
        this.brain = brain;
    }

    public Human(Date birthDate, String name, String[] emispheres) {
        this.birthDate = birthDate;
        this.name = name;
        this.brain = new Brain(emispheres);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Brain getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }
    
    public void printBrainComparison(Human human, Human human2) {
        if (human.brain.equals(human2.brain)) {
            System.out.println("The brains are the same");
        } else {
            System.out.println("The brains are different");
        }

    }
}
