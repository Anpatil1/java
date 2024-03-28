package oops.java8feature.lambdaExpression.RunnablelambdaExpression;
class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("it is run method");
    }
}

public class RunnablelambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

Thread t =new Thread(() -> System.out.println("it is run method using Lambda....."));
t.start();
    }
}

