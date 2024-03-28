package Assigmnent.oops.polymorphism;
//8. Write a Java program to create a base class Shape with methods draw() and calculateArea().
// Create three subclasses: Circle, Square, and Triangle.
// Override the draw() method in each subclass to draw the respective shape,
// and override the calculateArea() method to calculate and return the area of each shape.
 class Shape3 {
    public void draw1(){

    }
    public double calculateArea1(){
    return 0.0;
    }

}
class Circle1 extends Shape3{
     public double raidus1 =4;
     @Override
     public void draw1(){
         System.out.println("This is A Circle");

     }

      public  Circle1(double raidus1){
          this.raidus1 =raidus1;
      }
      @Override
      public double calculateArea1(){
         return Math.PI*raidus1 *raidus1;

      }

}
class Square1 extends Shape3{
    private double side;
    @Override
    public void draw1(){
        System.out.println("This is A Square1");

    }

    public  Square1(double side){
        this.side =side;
    }
    @Override
    public double calculateArea1(){
        return side *side;

    }

}
class Triangle1 extends Shape3{
    private double base;
    private double height;
    public  Triangle1(double base,double height){
        this.base =base;
        this.height =height;

    }
    @Override
    public void draw1(){
        System.out.println("This is A Triangle");

    }


    @Override
    public double calculateArea1(){
        return 0.5*height *base;

    }

}

