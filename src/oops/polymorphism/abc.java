package oops.polymorphism;

 class abc {

    public   int m1(int num1, int num2) {

        return num1 + num2;
    }
}

 class xyz extends abc {
    // Override m1 method from abc class
    @Override
    public int  m1(int num1, int num2) {
        // Call the superclass method to add num1 and num2
        return super.m1(num1, num2);
    }

    // Overloaded m1 method
    String m1(String str1, String str2,String str3){

        return str1+str2+str3;

    }
 }

