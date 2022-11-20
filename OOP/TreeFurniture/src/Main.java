public class Main {
    public static void main(String[] args) {

        Tree t1 = new Tree();
        Tree t2 = new Tree("chestnut");

        Furniture f1 = new Furniture();
        Furniture f2 = new Furniture("office");

        f1.doTable(t1);
        f2.doTable(t2);
        f1.doChair(t1);
        f2.doChair(t2);
    }
}