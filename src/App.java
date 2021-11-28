public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Circle and Cylinder");

        Circle circle = new Circle();
        circle.display();               //default constructor of circle

        Circle circle2 = new Circle(7);
        circle2.display();              //1st overide constructor of circle

        Circle circle3 = new Circle(7,"Green");
        circle3.display();              //2nd override constructor of circle

        Cylinder cylinder = new Cylinder();
        cylinder.display();             //default constructor of cylinder

        Cylinder cylinder2 = new Cylinder(14);
        cylinder2.display();             //1st overide constructor of cylinder

        Cylinder cylinder3 = new Cylinder(14,21);
        cylinder3.display();             //2nd overide constructor of cylinder
    }
}
