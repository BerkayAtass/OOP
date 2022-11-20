public enum Branch {
    MATH("information regarding math"),
    PHYSICS(" information regarding physics "),
    CS("information regarding cs"),
    ENG("information regarding eng");

    private String info;
    Branch(String info) {
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }
}
