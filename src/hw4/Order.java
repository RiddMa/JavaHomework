package hw4;

public class Order {
    int carType;
    int rentDay;

    public Order(int carType,int days){
        this.carType = carType;
        this.rentDay = days;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public int getCarType() {
        return carType;
    }

    public void setRentDay(int rentDay) {
        this.rentDay = rentDay;
    }

    public int getRentDay() {
        return rentDay;
    }
}
