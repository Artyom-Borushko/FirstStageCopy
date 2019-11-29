package main.java.javaCollections.mainTask.typesOfCandies;


public class BubbleCandies extends Candies {
    String packingColourOfBubbleCandies;

    public BubbleCandies(int cost, double weight, String brand, int sugarContent, String packingColourOfBubbleCandies) {
        super(cost, weight, brand, sugarContent);
        this.packingColourOfBubbleCandies = packingColourOfBubbleCandies;
    }

    public String getPackingColourOfBubbleCandies() {
        return packingColourOfBubbleCandies;
    }

    public void setPackingColourOfBubbleCandies(String packingColourOfBubbleCandies) {
        this.packingColourOfBubbleCandies = packingColourOfBubbleCandies;
    }

    @Override
    public String toString() {
        return "BubbleCandies{" +
                "packingColourOfBubbleCandies='" + packingColourOfBubbleCandies + '\'' +
                '}';
    }
}