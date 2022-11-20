public class Student {
    private String name;
    private double midtermExam;
    private double finalExam;


    public Student(String name, double midtermExam, double finalExam) {
        this.name = name;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(double midtermExam) {
        this.midtermExam = midtermExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }
}
