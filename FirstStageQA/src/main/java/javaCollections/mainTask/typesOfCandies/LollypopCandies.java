package main.java.javaCollections.mainTask.typesOfCandies;


public class LollypopCandies extends Candies {
    String packingColourOfLollypopCandies;

    public LollypopCandies(int cost, double weight, String brand, int sugarContent, String packingColourOfLollypopCandies) {
        super(cost, weight, brand, sugarContent);
        this.packingColourOfLollypopCandies = packingColourOfLollypopCandies;
    }

    public String getPackingColourOfLollypopCandies() {
        return packingColourOfLollypopCandies;
    }

    public void setPackingColourOfLollypopCandies(String packingColourOfLollypopCandies) {
        this.packingColourOfLollypopCandies = packingColourOfLollypopCandies;
    }

    @Override
    public String toString() {
        return "LollypopCandies{" +
                "packingColourOfLollypopCandies='" + packingColourOfLollypopCandies + '\'' +
                '}';
    }
}