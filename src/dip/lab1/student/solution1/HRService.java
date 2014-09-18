package dip.lab1.student.solution1;

/**
 *
 * @author dworgolet
 */
public class HRService {
    
   private Employee e;
   
    public HRService(Employee emp) {
        this.e = emp;
    }

    public double getAnnualWageForEmployee(Employee e){
        return e.getAnnualWage();
    }
    
    
}
