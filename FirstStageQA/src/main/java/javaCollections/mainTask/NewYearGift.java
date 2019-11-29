package main.java.javaCollections.mainTask;


        import main.java.javaCollections.mainTask.typesOfCandies.BubbleCandies;
        import main.java.javaCollections.mainTask.typesOfCandies.Candies;
        import main.java.javaCollections.mainTask.typesOfCandies.LollypopCandies;
        import main.java.javaCollections.mainTask.typesOfCandies.SourCandies;
        import main.java.javaCollections.mainTask.typesOfCandies.SticksCandies;

        import java.util.ArrayList;
        import java.util.Iterator;

public class NewYearGift {
    public static void main(String[] args) {

        ArrayList<Candies> candies = new ArrayList<>();

        Candies korovka = new SticksCandies(3, 14.12, "Communarka", 18, "White");
        Candies shipuchka = new LollypopCandies(2, 10.5, "Spartak", 25, "Brown");
        Candies rachki = new BubbleCandies(10, 25.18, "Roshen", 10, "Red");
        Candies kislinka = new SourCandies(7, 18.39,"Shokoladnica", 30, "Yellow");

        candies.add(korovka);
        candies.add(shipuchka);
        candies.add(rachki);
        candies.add(kislinka);

        double NewYearGiftWeightCounter = 0;
        for (int i = 0; i < candies.size(); i++) {
            NewYearGiftWeightCounter += candies.get(i).getWeight();
        }
        System.out.println("New Year Gift weight is " + NewYearGiftWeightCounter + " kilos");

        candies.sort((o1, o2) -> o1.getCost() - o2.getCost());
        System.out.println("Sorting sweets in the gift in ascending prices " + candies);

        Iterator<Candies> iterator = candies.iterator();
        while (iterator.hasNext()) {
            iterator.next().rangeOfSugarContent(18, 35);
        }
    }
}