package ex_lab.ex_1;

import java.util.Calendar;

@SuppressWarnings("unused")
public class HumanMain {
    public static void main(String[] args) {
        Brain brain = new Brain(new String[]{"left", "right"});
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, 1, 1);
        Human human = new Human(calendar.getTime(), "John", brain);
        Human human2 = new Human(calendar.getTime(), "John 2", new String[]{"left", "right"});

        human.printBrainComparison(human, human2);
    }
}
