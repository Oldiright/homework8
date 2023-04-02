package homework8;

public class Rectangle extends Shape {
    private final String shapeName = "Rectangle";
    {
        System.out.println(shapeName + " has been created");
    }

    @Override
    public String toString() {
        return "This is a " + shapeName;
    }
}

