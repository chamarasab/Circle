public class Circle {
    protected double radius;
    protected String color;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[33m";
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        double area = 3.14 * getRadius();
        return area;
    }

    public void display() {

        System.out.println("_________________________");
        System.out.println(ANSI_RED + "\tCircle" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Radius : " + getRadius() + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Color  : " + getColor() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Area   : " + getArea() + ANSI_RESET);
        System.out.println("_________________________");

    }
    
}