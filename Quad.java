package homework8;

public class Quad extends Shape {
    private final String shapeName = "Quad";
    {
        System.out.println(shapeName + " has been created");
    }

    @Override
    public String toString() {
        return "This is a " + shapeName;
    }
}

