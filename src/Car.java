public class Car {
    private String Brand;
    private String model;
    private int yearOfIssue;
    private double price;

    public Car(String brand, String model, int yearOfIssue, double price) {
        Brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
