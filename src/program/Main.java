package program;
import entities.HourContract;
import entities.enums.WorkerLevel;
import entities.Department;
import entities.Worker;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Worker worker =  new Worker();;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the department's name:");
        Department department = new Department(scan.nextLine());
        worker.setDepartment(department);

        System.out.println("Enter worker data:");
        System.out.println("name:");
        worker.setName(scan.nextLine());

        System.out.println("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(scan.nextLine().toUpperCase());
        worker.setLevel(level);

        System.out.println("Base Salary:");
        worker.setBaseSalary(scan.nextDouble());
        scan.nextLine();

        System.out.println("How many contracts to this worker?");
        int numberOfContracts = scan.nextInt();
        scan.nextLine();

        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(int i = 0; i < numberOfContracts; i++){
            HourContract hourContract = new HourContract();
            System.out.println("Enter contract " + (i + 1) + " data:" );
            System.out.println("Date (DD/MM/YYYY): ");
            LocalDate localDate = LocalDate.parse(scan.nextLine(),dateFormater);
            hourContract.setDate(localDate);

            System.out.println("Value per hour: ");
            hourContract.setValuePerHour(scan.nextDouble());
            scan.nextLine();

            System.out.println("Duration: ");
            hourContract.setHours(scan.nextInt());
            scan.nextLine();
            worker.addContract(hourContract);
        }
        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth yearMonth = YearMonth.parse(scan.nextLine(),dateTimeFormatter);
        int month = yearMonth.getMonthValue();
        int year = yearMonth.getYear();
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + department.getName());
        System.out.println("Income for: " + yearMonth + " " + worker.income(year,month));
        scan.close();
    }
}