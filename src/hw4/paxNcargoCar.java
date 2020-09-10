package hw4;

public class paxNcargoCar extends Vehicle {
    protected int capacityCargo;
    public paxNcargoCar(int type,String name,int rent,int capacity,int capacityCargo){
        this.type = type;
        this.name = name;
        this.rent = rent;
        this.capacity = capacity;
        this.capacityCargo = capacityCargo;
    }

}