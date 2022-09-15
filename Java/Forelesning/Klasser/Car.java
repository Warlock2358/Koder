package Java.Forelesning.Klasser;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int price;
    private int mileage;
    private int numberOfDoors;
    private int numberOfSeats;
    private int numberOfWheels;
    private String color;

    public Car(String brand, String model, int year, int price, int mileage, int numberOfDoors, int numberOfSeats,
            int numberOfWheels, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }
}
