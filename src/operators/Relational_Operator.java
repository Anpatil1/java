package operators;

public class Relational_Operator {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;

        System.out.println(a>b);//true
        System.out.println(a>=b);//true
        System.out.println(a<=b);//false
        System.out.println(a<=b);//false
        System.out.println(a == b); //false
        System.out.println( a != b ); //true
        A.main(args);
        B.main(args);
    }
    class A {
        public static void main(String[] args) {
            int a = 12;
            int b =12;

            System.out.println(a>b);//false
        }



    }
    class B{
        public static void main(String[] args) {
            //boolean type
            //System.out.println(true > false); //CTE
            //System.out.println(true >= false); //CTE
            //System.out.println(true <= false);//CTE
            //System.out.println(true < false); //CTE
            System.out.println(true == false);//false
            System.out.println(true != false);//true
            System.out.println('A'==65);//true
        }
    }
}
