package oops.java8feature;
interface num{
    int cube(int side1);
}
//class cube1 implements num{
//    @Override
//    public int cube(int side1){
//        return (side1*side1*side1);
//    }
//}
public class cube {
    public static void main(String[] args) {
        num cube =(int side1)->(side1*side1*side1);
        int result1 =cube.cube(5);
        System.out.println(""+result1);
    }
}
