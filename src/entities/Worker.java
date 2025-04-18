package entities;
import entities.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    //Attributes
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    //associaçoes
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    //Constructors
     public Worker(){
     }

    public Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //Methods:
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public Double income(int year, int month){
         double sum = baseSalary;
         for(HourContract c : contracts){
             int c_year = c.getDate().getYear();
             int c_month=c.getDate().getMonthValue();
             if(year ==c_year && month ==c_month){
                    sum+=c.totalValue();
             }
         }
         return sum;
    }
}
