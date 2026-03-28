package Top_100_Coding_Question.Opps_JavaBasics;

public class AbstractPractice {
    public static void main(String[] args) {


        Shape sh = new Circle(12);
        sh.area();
        Shape sh1 = new Rectangle(12,12);
        sh1.area();
    }
}

//Circle and Rectangle

abstract class Shape{
    abstract public void area();
}
class Circle  extends Shape{
    double r;
    Circle(double r){
        this.r =r;

    }

    @Override
    public void area() {
     double res = Math.PI*r*r;
        System.out.println("Area of Circle -> " + res);

    }
}
class Rectangle extends Shape{

    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}
