package HomeWork.hw2;

/*
    Task 2.4
    - Declare the class as final so it can’t be extended.
    - Make all fields private so that direct access is not allowed.
    - Don’t provide setter methods for variables
    - Make all mutable fields final so that it’s value can be assigned only once.
    - Initialize all the fields via a constructor performing deep copy.
    - Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
*/

public final class Footballer implements Cloneable {
    private final String name;
    private String team;
    private double transferPrice;

    public Footballer(String name, String team, double transferPrice) {
        this.name = name;
        this.team = team;
        this.transferPrice = transferPrice;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public double getTransferPrice() {
        return transferPrice;
    }

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Footballer(getName(), getTeam(), getTransferPrice());
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Team: " + getTeam() + ", Price: $" + getTransferPrice() + " m";
    }
}
