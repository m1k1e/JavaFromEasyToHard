/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3.constructors;

//import unit3.domainmodel.Employee;

import unit3.domainmodel.Employee;


/**
 *
 * @author User
 */
public class ConstructorsTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Mikhail", "Java Developer", 20000);
        System.out.println(employee);
    }
    
}
