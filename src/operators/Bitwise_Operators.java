package operators;
// (&, |, ^ ,<<,>>, ~)
public class Bitwise_Operators {
    public static void main(String[] args) {
        System.out.println("Bitwise And");
        System.out.println( 12 & 4);//4
        System.out.println((12 -4 != 0) & (12>4));//true
        System.out.println(23 & 23); //23
        System.out.println(2 & 8);//0


        System.out.println("Bitwise Or");
        System.out.println( 12 | 4);//12
        System.out.println((12 -4 != 0) | (12>4));//true
        System.out.println(23 | 23); //23
        System.out.println(2 | 8);//10
        System.out.println(2 | 1);//3

        System.out.println("Bitwise XOR");
        System.out.println(12 ^ 5);//9
        System.out.println(3 ^ 6);//5
        System.out.println( 4 ^ 13);//9
        System.out.println( 7 ^ 14);//9
        System.out.println(  6 ^ 10);//12

        System.out.println("left shift");
        System.out.println(12 << 1);//24
        System.out.println(3 << 2);//12
        System.out.println( 4 << 3);//32
        System.out.println( 7 << 1);//14
        System.out.println(  6 << 1);//12

        System.out.println("Right  shift");
        System.out.println(12 >> 2);//3
        System.out.println(3 >> 1);//1
        System.out.println( 4 >> 2);//1
        System.out.println( 7 >> 1);//3
        System.out.println(  6 >> 2);//1

        System.out.println("negation");
        System.out.println(~8);//-9
        System.out.println(~-6);//5
        System.out.println( ~9);//-10
        System.out.println( ~5);//-6
        System.out.println(  ~4 );//-5
    }
}
