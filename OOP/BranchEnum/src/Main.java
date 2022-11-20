public class Main {
    public static void main(String[] args) {


        Teacher teacher1 = new Teacher(1, Branch.CS);
        Teacher teacher2 = new Teacher(2, Branch.ENG);
        Teacher teacher3 = new Teacher(3, Branch.MATH);
        Teacher teacher4 = new Teacher(4, Branch.PHYSICS);

        Teacher[] teachers = {teacher1,teacher2,teacher3,teacher4};

        for (int i = 0; i< teachers.length ; i++){
            System.out.println(teachers[i].toString() + " " + teachers[i].getBranch().getInfo());
        }
    }
}