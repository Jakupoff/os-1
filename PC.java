package org.example;

public class PC extends Computer {
    private String ram; // declare variables
    private String hdd;// declare variables
    private String cpu;// declare variables
    //    creating constructor
    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}