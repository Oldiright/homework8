package homework8;

public class Triangle extends Shape {
    private final String shapeName = "Triangle";
    {
        System.out.println(shapeName + " has been created");
    }

    @Override
    public String getType() {
        return "This is a " + shapeName;
    }
}


