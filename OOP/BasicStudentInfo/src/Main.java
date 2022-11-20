import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student  student1 = new Student("Ahmet",0,0);
        Student  student2 = new Student("Mehmet",0,0);
        Student  student3 = new Student("Hasan",0,0);

        System.out.println("Enter midterm score for " + student1.getName());
        student1.setMidtermExam(scan.nextDouble());
        System.out.println("Enter final score for " + student1.getName());
        student1.setFinalExam(scan.nextDouble());
        System.out.println(student1.getName() + "'s Score : " + calculuteScore(student1));

        System.out.println("Enter midterm score for " + student2.getName());
        student2.setMidtermExam(scan.nextDouble());
        System.out.println("Enter final score for " + student2.getName());
        student2.setFinalExam(scan.nextDouble());
        System.out.println(student2.getName() + "'s Score : " + calculuteScore(student2));


        System.out.println("Enter midterm score for " + student3.getName());
        student3.setMidtermExam(scan.nextDouble());
        System.out.println("Enter final score for " + student3.getName());
        student3.setFinalExam(scan.nextDouble());
        System.out.println(student3.getName() + "'s Score : " + calculuteScore(student3));

    }

    public static double calculuteScore(Student student){
        return ((student.getMidtermExam() * 4 / 10) + (student.getFinalExam() * 6 / 10));
    }
}