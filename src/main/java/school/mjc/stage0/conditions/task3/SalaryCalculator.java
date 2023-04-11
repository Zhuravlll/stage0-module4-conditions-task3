package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double afterTax;
        if (salary < 10000 && salary > 0) {
            System.out.println(afterTax = salary * 0.85);
        }
        if (salary > 10000 && salary < 20000) {
            System.out.println(afterTax = salary * 0.82);
        }
        if (salary > 20000) {
            System.out.println(afterTax = salary * 0.80);
        }
        if (salary <= 0) {
            System.out.println("wrong input!");
        }
    }
}