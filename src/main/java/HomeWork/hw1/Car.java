package main.java.HomeWork.hw1;

/*
    Task 1.7
 */

public class Car implements Cloneable {
    private String manufacturer;
    private String model;
    private int releaseYear;

    public Car(String manufacturer, String model, int releaseYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Car(getManufacturer(), getModel(), getReleaseYear());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer: ").append(getManufacturer())
                .append(", Model: ").append(getModel())
                .append(", Release Year: ").append(getReleaseYear())
                .append(", hashCode: ").append(hashCode());
        return sb.toString();
    }
}
