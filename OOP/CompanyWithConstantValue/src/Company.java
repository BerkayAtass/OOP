public class Company {
    static int index;
    Worker[] workers;

    public Company(int number){
        workers = new Worker[number];
    }

    public void addWorker(Worker worker){
        workers[index] = worker;
        index++;
    }

    public void showData(Worker worker){
        System.out.println(worker.id + " " + Worker.compName);
    }
}
