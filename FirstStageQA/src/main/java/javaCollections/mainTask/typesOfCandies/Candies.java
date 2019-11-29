package main.java.javaCollections.mainTask.typesOfCandies;

public class Candies {
    private int cost;
    private double weight;
    private String brand;
    private int sugarContent;

    public Candies(int cost, double weight, String brand, int sugarContent) {
        this.cost = cost;
        this.weight = weight;
        this.brand = brand;
        this.sugarContent = sugarContent;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", brand=" + brand +
                ", sugarContent=" + sugarContent +
                '}';
    }

    public void rangeOfSugarContent (int beginningOfRange, int endOfRange) {
        if (getSugarContent() >= beginningOfRange && getSugarContent() <= endOfRange) {
            System.out.println("Candy corresponding to the specified range of sugar " + this.brand);
        }
    }
}
