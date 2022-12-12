package day31_Constructors;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(int hourlyRate, int stateTaxRate, int federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100; // to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate/100; // to make sure that user does not need to convert the percentage to decimal
        this.weeklyHours = weeklyHours;
    }

    public double salary (){
       // System.out.println("salary " + (hourlyRate * weeklyHours)*52);
        return weeklyHours * hourlyRate * 52;

    }
    public double stateTax(){
       return salary() * stateTaxRate;
    }
    public double totalFederalTax(){
        return salary() * federalTaxRate ;
    }
    public double salaryAfterTax(){
        return salary() - stateTax() - totalFederalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", salary= $" + salary() +
                ", stateTaxRate= $" + stateTaxRate +
                ", federalTaxRate= $" + federalTaxRate +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
    /*
    SalaryCalculator Task:
1.1 Create a class named Salary calculator:
        Attributes:
            hourlyRate, stateTaxRate,
federalTaxRate, weeklyHours
            Add a constructor to set all the fields
        Actions:
            salary(): calculates the salary (
hourlyRate * weeklyHour * 52)
            stateTax(): calculates the
totalStateTax
            federalTax(): calculates the
total federal tax
            salaryAfterTax(): calculates the
salary after tax
            toString(): displays the salary,
stateTax, federalTax, salaryAfterTax of the Object
     */
}
