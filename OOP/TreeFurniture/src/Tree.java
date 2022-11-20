public class Tree {
    private String type;

    public Tree(){
        this("pine");
    }
    public Tree(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
