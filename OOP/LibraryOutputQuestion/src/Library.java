public class Library {
    static int index;
    Book[] books;
    public Library(int i){
        books = new Book[i];
    }
    void addBook(Book b){
        books[index] = b;
        index++;
    }
    public void bookData(Book b){
        System.out.println("ISBN: " + b.isbn+";" +b.name + ";" + b.type.getDesc());
    }
}
