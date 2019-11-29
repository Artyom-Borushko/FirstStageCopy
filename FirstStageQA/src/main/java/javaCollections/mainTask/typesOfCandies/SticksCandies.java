package main.java.javaCollections.mainTask.typesOfCandies;


public class SticksCandies extends Candies{
    String packingColourOfStickCandies;

    public SticksCandies(int cost, double weight, String brand, int sugarContent, String packingColourOfStickCandies) {
        super(cost, weight, brand, sugarContent);
        this.packingColourOfStickCandies = packingColourOfStickCandies;
    }

    public String getPackingColourOfStickCandies() {
        return packingColourOfStickCandies;
    }

    public void setPackingColourOfStickCandies(String packingColourOfStickCandies) {
        this.packingColourOfStickCandies = packingColourOfStickCandies;
    }

    @Override
    public String toString() {
        return "SticksCandies{" +
                "packingColourOfStickCandies='" + packingColourOfStickCandies + '\'' +
                '}';
    }
}