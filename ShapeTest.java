package homework8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape a = new Ellipse();
        Shape b = new Quad();
        Shape c = new Circle();
        Shape d = new Triangle();
        Shape e = new Rhombus();
        Shape f = new Rectangle();
        System.out.println(NamePrinter.getInstance().printName(a));
        System.out.println(NamePrinter.getInstance().printName(b));
        System.out.println(NamePrinter.getInstance().printName(c));
        System.out.println(NamePrinter.getInstance().printName(d));
        System.out.println(NamePrinter.getInstance().printName(e));
        System.out.println(NamePrinter.getInstance().printName(f));



    }

}


