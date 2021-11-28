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
        System.out.println(ANSI_RED + "\tCyliner" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Height : " + getHeight() + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Radius : " + getRadius() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Volume : " + getVolume() + ANSI_RESET);
        System.out.println("_________________________");
    }

}
