/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

/**
 *
 * @author User
 */




public class Lesson17 {
    public static void main(String[] args) {
        System.out.println("Dogs count = " + Dog.getDogsCount());
        
        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charley");
        lab.setBread("Lab");
        lab.setSize(Size.MEDIUM);
        lab.bark();
        
        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Charley");
        sheppard.setBread("Lab");
        sheppard.setSize(Size.LARGE);
        sheppard.bark();
        
        Dog doberman = new Dog();
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setName("Jack");
        doberman.setBread("Doberman");
        doberman.setSize(Size.LARGE);
        doberman.bark();
        doberman.bite();
        
        
        Size s = Size.SMALL;
        //System.out.println(s);
        
        Size s1 = Size.valueOf("LARGE");
        //System.out.println(s1);
        
        Size[] value = Size.values();
        for(Size val: value){
            System.out.print(val + " ");
        }
        
       /* System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Doberman's name is " + doberman.getName());*/
    }
}
