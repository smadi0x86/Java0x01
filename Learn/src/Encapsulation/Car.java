package Encapsulation;

public class Car {

    // ! Only the class can access these attributes.

    private String model;
    private String color;
    private int year;

    Car(String model, String color, int year) {
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);
    }

    // ! Getters and setters are used to access the private attributes.

    // ? Getters are used to get the value of the private attributes.
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    // ? Setters are used to change the value of the private attributes.

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
