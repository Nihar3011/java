
package programs;

import java.util.*;

class Employee{
    public int empNo;
    public String name;
    public String designation;
    public int salary;

    public Employee(int empNo, String name, String designation, int salary) {
        this.empNo = empNo;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public String toString(){
        return "My Employee No: " + empNo + " and Name is: " + name + ". Wroking with post: "
                + designation + " and my salary is: " + salary + ".";
    }
    
    
}

class DesignationSalary{
  
    HashMap<String , Integer> Salary(){
    
    HashMap<String , Integer> hm = new HashMap<String, Integer>();
          hm.put("Software Engineer", 25000);
          hm.put("System Analyst",35000);
          hm.put("Programmer Analyst", 45000);
          hm.put("Project Lead",55000);
          hm.put("Project Manager",65000);
    
          return hm;
          }
    
}

public class Collection  {
    
    public static void main(String[] args) {
        DesignationSalary ds= new DesignationSalary();
        
        HashMap<String , Integer> salary=ds.Salary();
        
        LinkedList<Employee> l1= new LinkedList<Employee>();
        
        l1.add(new Employee(1,"Manthan","Project Manager",salary.get("Project Manager")));
        l1.add(new Employee(2,"Priyam","Project Lead",salary.get("Project Lead")));
        l1.add(new Employee(3,"Nikunj","Programmer Analyst",salary.get("Programmer Analyst")));
        l1.add(new Employee(4,"Purvit","System Analyst",salary.get("System Analyst")));
        l1.add(new Employee(5,"Nihar","Software Engineer",salary.get("Software Engineer")));
        
        
        ListIterator<Employee> litr= l1.listIterator();
        
        while(litr.hasNext()){
            Employee element= litr.next();
                System.out.println(element); 
        }
            
        
    }
}
