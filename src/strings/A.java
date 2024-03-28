package strings;

class A {


    public static void main(String[] args) {

         String name = "Avadhut";
        String name1 = " Nangare ";
        String fullName =name+name1;
         int value = fullName.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String Ustring = name.toUpperCase();
        System.out.println(Ustring);
        System.out.println(name1.trim());
        //substring
        System.out.println(fullName.substring(1,11));

        //charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i)+"  ");

        }


    }
    }

