package org.example;

public class TestFactory {
    public static void main(String[] args) {
        //This line creates a Computer object named pc
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB", "2.4 GHz");
        //This line creates a Computer object named server
        Computer server = ComputerFactory.getComputer("server", "16GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
