package org.example;

public class ServerFactory implements ComputerAbstractFactory{
    private String ram; // declare variables
    private String hdd; // declare variables
    private String cpu; // declare variables
    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() { //This line creates a new instance of a PC object
        return new Server(ram,hdd,cpu);
    }
}
