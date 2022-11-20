public class Book {
    String name;
    Type type;
    String isbn;
    int year;
    static int counter;

    public Book(String bName,Type type){
        this(bName,type,2021,++counter);
    }

    public Book(String bName,Type type,int y){
        this(bName,type,y,++counter);
    }

    private Book(String bName,Type type, int y, int count) {
        this.name= bName;
        this.year= y;
        this.isbn= y+"-"+count;
        this.type= type;
    }

    @Override
    public String toString(){
        return "ISBN: "+isbn+":"+name+":"+type;
    }
}
