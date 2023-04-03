package homework8;

class NamePrinter {
    private static NamePrinter instance = new NamePrinter();

    private NamePrinter() {

    }

    public static NamePrinter getInstance() {
        return instance;
    }
     public String printName(Shape a) {
        return a.getType();
     }

}
