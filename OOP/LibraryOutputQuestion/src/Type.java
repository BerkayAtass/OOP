public enum Type {
    ADVENTURE(100,"has an epic journey"),
    HISTORY(200,"Facts about history"),
    SCIENCE(300,"Nonfiction");
    private final int id;
    private final String desc;

    private Type(int id, String desc){
        this. id = id;
        this.desc= desc;
    }

    public String getDesc(){
        return this.desc;}
}
