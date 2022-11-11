public class player {
    String Name;
    private int Select = 0;//1-Rock   2-Paper   3-Scissors
    private int Score = 0;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSelect() {
        return Select;
    }

    public void setSelect(int select) {
        Select = select;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
