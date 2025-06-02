package entities;

public class Employee {
	
    public String name;
    public double glossSalary;
    public double tax;
    
    public double netSalary() {
    	return glossSalary - tax;
    }
    public  double increaseSalary(double percentage) { 
     
    	return ((glossSalary * percentage/100)+glossSalary) - tax;
    }
    
    public String toString() {
    	return name
    			+", $"
    			+ String.format("%.2f%n", netSalary());
    		
    
    
    }

}
