package package_lab_3.Ex_1;

public class Pet {

    protected String name;

    public static String type = "Pet";

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeNoise() {
        return "Pet noise";
    }

    public String getFood() {
        return "Pet food";
    }

    public static String getType() {
        return type;
    }
}