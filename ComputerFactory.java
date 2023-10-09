package org.example;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu){ //that creates and returns instances of different types of computers
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram,
                hdd, cpu);
        return null;
    }
}