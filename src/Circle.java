public class Circle {
    protected double radius;
    protected String color;
    
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
        System.out.println("\tCircle");
        System.out.println("Radius : " + getRadius());
        System.out.println("Color  : " + getColor());
        System.out.println("Area   : " + getArea());
        System.out.println("_________________________");

    }
    
}