public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Ahmet");
        System.out.println(Worker.compName);

        Worker w2 = new Worker("Mert");
        Worker w3 = new Worker("Cenk");
        System.out.println(Worker.number);
        Worker w4 = new Worker("Okan");
        System.out.println(w2.id);

        Company company = new Company(4);
        company.addWorker(w1);
        company.addWorker(w2);
        company.addWorker(w3);
        company.addWorker(w4);


        System.out.println(Company.index);
        Worker.compName = "Just Steel Inc.";
        company.showData(w3);

    }
}