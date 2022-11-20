public class Company {

    private Employee[] employees;
    private static int employeeNumber = 0;

    public Company(Employee[] employees) {
        this.employees = employees;
        employeeNumber++;
    }


    public Employee[] getEmployees() {
        return employees;
    }

    public void printAllEmployeesName(){
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }


}
