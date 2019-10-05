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



public class Dog {
    private static int dogsCount;
    private int paws = 4;
    private int tail = 1;
    private String name;
    private String bread;
    private Size size = Size.UNDERFIND;
    
    public Dog(){
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }
    
    public static int getDogsCount(){
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        /*if(size.equalsIgnoreCase("Big") || size.equalsIgnoreCase("Averege") || size.equalsIgnoreCase("Small")){
        this.size = size;
        }else{
            System.out.println("Size should be one of these: Big, Averege or Small");*/
        this.size = size;
        
    }
    
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if(paws == 4){
          this.paws = paws;
        }else
        {
            this.paws = 4;
            System.out.println("User tried to assing " + paws + " paws for a dog.");
            System.out.println("Correct number is 4.");
        }
        
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if(tail == 1){
        this.tail = tail;
        }else
        {
         this.tail = 1;   
         System.out.println("User tried to assing " + tail + " tails for a dog.");
         System.out.println("Correct number is 1.");
        }
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    
    public void bark(){
        switch(size){
            case LARGE: case EXTRA_LARGE:
                System.out.println("Wof - Wof");
                break;
            case MEDIUM:
                System.out.println("Raf - Raf");
                break;
            case SMALL: case EXTRA_SMALL: 
                System.out.println("Tiaf - Tiaf");
                break;
            default:
                System.out.println("Dog's size is undefined");
        }
    }
    
    public void bite(){
        if(dogsCount > 2){
            System.out.println("Dogs are biting you.");
        }else {
            bark();
        }
        
    }
    
}
