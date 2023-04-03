package homework8;

public class Circle extends Shape {
    private final String shapeName = "Circle";
    {
        System.out.println(shapeName + " has been created");
    }

    @Override
    public String getType() {
        return "This is a " + shapeName;
    }
}


