package org.example;

public class PCFactory implements ComputerAbstractFactory{
    private String ram; // declare variables
    private String hdd;// declare variables
    private String cpu;// declare variables
    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() { // This line creates a new instance of a PC object
        return new PC(ram,hdd,cpu);
    }
}
