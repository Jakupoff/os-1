package org.example;

public abstract class Computer {
    public abstract String getRAM(); //This method is abstract, meaning it doesn't have a method body
    public abstract String getHDD(); //This method is abstract and has no implementation
    public abstract String getCPU();
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CDU=" + this.getCPU();
    }
}