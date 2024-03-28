package oops.java8feature;




interface Addable{
    int addition2 ( int a,int b);
}
class add implements Addable{
    @Override
    public int addition2(int a, int b){
    return (  a + b);
}
}
public class Demo5 {
    public static void main(String[] args) {
//        Addable addition2 =((a, b) -> (a+b)) ;
//        int result = addition2.addition2(10,2);
//        System.out.println(""+result);
Addable addition2 = (int a,int b) ->{int c =( a+b);
    return c;
};
        addition2.addition2(10,2);
    }
}
