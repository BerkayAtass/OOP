public class Furniture {
    private String type;

    public Furniture(){
        this("home");
    }
    public Furniture(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void doTable(Tree tree){
        System.out.println("Table made from " + tree.getType() + " for " + this.type);
    }
    public void doChair(Tree tree){
        System.out.println("Chair made from " + tree.getType() + " for " + this.type);
    }
}
