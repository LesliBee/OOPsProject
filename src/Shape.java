public interface Shape {
    /*
   Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
   Create 2 classes, Circle & Square, that implements functionality defined in the Shape Interface.
   Test your code.
    */
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape {
    public static final double pi= 3.14;
    public double radius;

    public Circle(double radius) {

        this.radius= radius;
    }
    @Override
    public void calculateArea() {
        double areaOfCircle= pi* radius*radius;
        System.out.println("Area of circle is "+areaOfCircle);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter= 2* pi* radius;
        System.out.println("Perimeter of circle is "+perimeter);
    }

}

class Square implements Shape {
    double side;
    Square(double side){

        this.side= side;
    }

    @Override
    public void calculateArea() {
        double areaOfSquare= side* side;
        System.out.println("Area of square is "+areaOfSquare);
    }

    @Override
    public void calculatePerimeter() {
        double perimeterOfSquare= 4 * side;
        System.out.println("Perimeter of square is "+perimeterOfSquare);
    }
}

