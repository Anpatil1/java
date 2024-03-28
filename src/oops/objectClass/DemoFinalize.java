package oops.objectClass;

public class DemoFinalize {

    public static void main(String[] args) {
        class A{
            @Override
            protected void finalize() throws Throwable{
                System.out.println("Finalize method");
            }

        }


        A a = new A();
        a = null;
        System.out.println("Rest Of The  Main");
        System.gc();
    }
}
