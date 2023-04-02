package homework8;

public class Rhombus extends Shape {
    private final String shapeName = "Rhombus";
    {
        System.out.println(shapeName + " has been created");
    }

    @Override
    public String toString() {
        return "This is a " + shapeName;
    }
}

