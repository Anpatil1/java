package constructor;

public class A {
//    int x;
//    A(){
//        this(100);
//        System.out.println("zero parameterized constructor");
//    }
//    A(int x){
//        //this();//calling zero param constructor
//        this.x = x;
//    }
//
//    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a.x);
//}
    int x;
    A(){
        this(100);
        System.out.println("zero parameterized constructor");
    }
    A(int x){
        this.x =x;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
    }
}