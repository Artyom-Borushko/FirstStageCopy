package main.java.javaCollections.mainTask.typesOfCandies;


public class SourCandies extends Candies {
    String packingColourOfSourCandies;

    public SourCandies(int cost, double weight, String brand, int sugarContent, String packingColourOfSourCandies) {
        super(cost, weight, brand, sugarContent);
        this.packingColourOfSourCandies = packingColourOfSourCandies;
    }

    public String getPackingOfSourCandies() {
        return packingColourOfSourCandies;
    }

    public void setPackingOfSourCandies(String packingOfSourCandies) {
        this.packingColourOfSourCandies = packingOfSourCandies;
    }

    @Override
    public String toString() {
        return "SourCandies{" +
                "packingColourOfSourCandies='" + packingColourOfSourCandies + '\'' +
                '}';
    }
}