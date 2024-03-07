package classComponents.nestedClasses.staticNestedClasses;

public class StaticNestedInstanceMemberAccess {
//    public static void main(String[] args) {
//
//       Book.FictionBook  fictionBook = new Book.FictionBook();
//        System.out.println("Fiction Book ID : "+ fictionBook.fictionBookId);
//        fictionBook.printFictionBook();

    public static void main(String[] args) {
        Book.FictionBook fictionBook = new Book.FictionBook();
        System.out.println("Fiction Book Id :"+fictionBook.fictionBookId);
        fictionBook.printFictionBook();
    }
}