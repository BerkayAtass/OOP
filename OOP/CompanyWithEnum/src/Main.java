public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee(0001 , "ahmet", 5000, CompanyName.GOOGLE);
        Employee employee2 = new Employee(0002 , "mehmet", 10000, CompanyName.IBM);
        Employee employee3 = new Employee(0003 , "veli", 9000, CompanyName.APPLE);

        Employee[] employees = {employee1,employee2,employee3};
        Company company = new Company(employees);

        company.printAllEmployeesName();

    }
}