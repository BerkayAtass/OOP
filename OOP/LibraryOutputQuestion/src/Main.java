public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("My Adventure", Type.ADVENTURE);
        Book b2 = new Book("Our History", Type.HISTORY, 2010);

        System.out.println(Book.counter); //(O1)
        System.out.println(b1); //(O2)

        Book b3 = new Book("Math", Type.SCIENCE);
        b2.type = b3.type;
        Book b4 = new Book("my voyage", Type.ADVENTURE, 2015);

        Library ourLibrary = new Library(3);

        System.out.println(b2.type + ":" + b2.type.getDesc()); //(O3)
        System.out.println(b3); //(O4)
        ourLibrary.addBook(b1);
        ourLibrary.addBook(b2);

        System.out.println(Library.index); //(O5)
        ourLibrary.addBook(b3);
        System.out.println(b2); //(O6)
        ourLibrary.bookData(b2); //(O7)
    }
}
