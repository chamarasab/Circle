public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        height = 1.0;
    }

    public Cylinder(double radius) {
        super.radius = radius;
    }
    
    public Cylinder(double radius,double height) {
        super.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double volume = 3.14 * (getRadius() * getRadius()) * getHeight();  //pi * r*r * h
        return volume;
    }

    public void display() {
        System.out.println("_________________________");
        System.out.println("\tCyliner");
        System.out.println("Height : " + getHeight());
        System.out.println("Radius : " + getRadius());
        System.out.println("Volume : " + getVolume());
        System.out.println("_________________________");
    }

}
