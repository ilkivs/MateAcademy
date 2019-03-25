package HomeWork.hw2;

/*
    Task 2.1
 */

public class Pizza {
    private String name;
    private boolean withPepper;
    private boolean withDoubleCheese;
    private boolean withCorn;
    private boolean withSausage;
    private int size;
    private double price;

    public String getName() {
        return name;
    }

    public boolean isWithPepper() {
        return withPepper;
    }

    public boolean isWithDoubleCheese() {
        return withDoubleCheese;
    }

    public boolean isWithCorn() {
        return withCorn;
    }

    public boolean isWithSausage() {
        return withSausage;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", withPepper=" + withPepper +
                ", withDoubleCheese=" + withDoubleCheese +
                ", withCorn=" + withCorn +
                ", withSausage=" + withSausage +
                ", size=" + size +
                " cm, price=" + price +
                " UAH}";
    }

    public static class Builder {
        private Pizza pizza;

        public Builder() {
            pizza = new Pizza();
        }

        public Builder setName(String name) {
            pizza.name = name;
            return this;
        }

        public Builder withPepper(boolean withPepper) {
            pizza.withPepper = withPepper;
            return this;
        }

        public Builder withDoubleCheese(boolean withDoubleCheese) {
            pizza.withDoubleCheese = withDoubleCheese;
            return this;
        }

        public Builder withCorn(boolean withCorn) {
            pizza.withCorn = withCorn;
            return this;
        }

        public Builder withSausage(boolean withSausage) {
            pizza.withSausage = withSausage;
            return this;
        }

        public Builder setSize(int size) {
            pizza.size = size;
            return this;
        }

        public Builder setPrice(int price) {
            pizza.price = price;
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }
}
