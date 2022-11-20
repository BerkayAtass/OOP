public class Worker {
    String name;
    public static String compName;
    public static int number;
    public int id;

    public Worker(String name){
        this(name, number);
        compName = "Iron an Steel Inc.";
    }

    private Worker(String name, int number){
        this.number = number;
        this.number++;
        this.name = name;
        this.id = number;
    }

}
