package hw21;

import java.util.Random;

public class Storage {
    protected int capacityTotal;
    protected int capacityUsed;

    public Storage(int capacity){
        setCapacityTotal(capacity);
    }

    public void setCapacityTotal(int capacity) {
        this.capacityTotal = capacity;
    }

    public void setCapacityUsed(int capacityUsed) {
        if (capacityUsed < 0 || capacityUsed > this.capacityTotal) {
            throw new IllegalArgumentException();
        }
        this.capacityUsed = capacityUsed;
    }

    public int getCapacityTotal() {
        return capacityTotal;
    }

    public int getCapacityUsed() {
        return capacityUsed;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "capacityTotal=" + capacityTotal +
                ", capacityUsed=" + capacityUsed +
                '}';
    }

    public void putCargo(int space) {
        if (space < 1 || space > 20) {
            throw new IllegalArgumentException();
        }
        setCapacityUsed(this.capacityUsed + space);
    }

    public void takeCargo(int space){
        if (space < 1 || space > 20) {
            throw new IllegalArgumentException();
        }
        setCapacityUsed(this.capacityUsed - space);
    }
}


class ThreadIn implements Runnable{
    protected String name;
    protected Storage storage;
    Thread t;

    public void setName(String name) {
        this.name = name;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public Storage getStorage() {
        return storage;
    }

    public ThreadIn(String name, Storage storage){
        setName(name);
        setStorage(storage);
    }

    public void run(){
        Random r = new Random();
        while(true){
            synchronized (storage){
                int n = r.nextInt(20)+1;
                //generate random int between 1-20
                System.out.println(name+" put "+n+" cargo into storage");
                if(storage.getCapacityTotal()- storage.getCapacityUsed()<n){
                    System.out.println("failed. no enough free space.");
                }
                else{
                    storage.putCargo(n);
                    System.out.println("success.");
                }
                System.out.println("capacity used now: "+storage.getCapacityUsed()+
                        " out of "+storage.getCapacityTotal());
                storage.notify();
            }
            try{
                t.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void start(){
        System.out.println("initializing thread "+name);
        if(t==null){
            t = new Thread(this, name);
            t.start();
        }
    }
}

class ThreadOut implements Runnable{
    protected String name;
    protected Storage storage;
    Thread t;

    public void setName(String name) {
        this.name = name;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public Storage getStorage() {
        return storage;
    }

    public ThreadOut(String name, Storage storage){
        setName(name);
        setStorage(storage);
    }

    public void run(){
        Random r = new Random();
        while(true){
            synchronized (storage){
                int n = r.nextInt(20)+1;
                //generate random int between 1-20
                System.out.println(name+" take "+n+" cargo out of storage");
                if(storage.getCapacityUsed()<n){
                    System.out.println("failed. no enough cargo.");
                }
                else{
                    storage.takeCargo(n);
                    System.out.println("success.");
                }
                System.out.println("capacity used now: "+storage.getCapacityUsed()+
                        " out of "+storage.getCapacityTotal());
                storage.notify();
            }
            try{
                t.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void start(){
        System.out.println("initializing thread "+name);
        if(t==null){
            t = new Thread(this, name);
            t.start();
        }
    }
}


