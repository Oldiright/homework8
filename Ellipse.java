package homework8;

public class Ellipse extends Shape {
    private final String shapeName = "Ellipse";
    {
        System.out.println(shapeName + " has been created");
    }

    @Override
    public String getType() {
        return "This is a " + shapeName;
    }
}


