
package dip.lab1.student.solution1;
import java.text.NumberFormat;
/**
 *
 * @author Daniel
 */
public class Startup {
    
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee(10, 2080);
        Employee emp2 = new SalariedEmployee(50000, 5000);
    
        NumberFormat nf = NumberFormat.getCurrencyInstance();
    
        HRService hr = new HRService(emp1);

    System.out.println("Hourly Employee Salary is " + nf.format(hr.getAnnualWageForEmployee(emp1)));
    System.out.println("Salaried Employee Salary is " + nf.format(hr.getAnnualWageForEmployee(emp2)));
    
    }
}
