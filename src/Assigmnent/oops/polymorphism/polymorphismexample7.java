package Assigmnent.oops.polymorphism;

public class polymorphismexample7 {
     public static void main(String[] args) {
         Shape3 circle1 =new Circle1(4);
         Shape3  square1 =new Square1(5);
         Shape3 triangle1 =new Triangle1(3,4);

        drawShapeAndCalculateArea(circle1);
         drawShapeAndCalculateArea(square1);
         drawShapeAndCalculateArea(triangle1);
     }
    public static void drawShapeAndCalculateArea(Shape3 shape1) {
        shape1.draw1();
        double area = shape1.calculateArea1();
        System.out.println("Area : " + area);
    }
 }
