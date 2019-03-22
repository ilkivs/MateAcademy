package HomeWork.hw1;

//class describes car
public class Task_1_7 implements Cloneable{
    private String manufacturer;
    private String model;
    private int releaseYear;

    public Task_1_7(String manufacturer, String model, int releaseYear) {
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
        }catch (CloneNotSupportedException e) {
            return new Task_1_7(getManufacturer(), getModel(), getReleaseYear());
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
