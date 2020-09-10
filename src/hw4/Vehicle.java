package hw4;

public abstract class Vehicle {
    protected int type;
    protected String name;
    protected int rent;
    protected int capacity;

    @Override
    public String toString() {
        return  name;
    }
}

