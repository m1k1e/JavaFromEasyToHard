/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3.domainmodel;

/**
 *
 * @author User
 */
public class Employee {
    private static int id = 0;
    private String name;
    private String position;
    private int salary;
    
    public Employee(String name, String position, int salary){
        id += 1;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee (name = " + name + ", position = " + position + ", salary = " + salary + ')' ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
