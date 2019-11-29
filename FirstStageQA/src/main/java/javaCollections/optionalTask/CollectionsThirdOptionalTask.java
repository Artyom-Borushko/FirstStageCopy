package main.java.javaCollections.optionalTask;

import java.util.ArrayList;
import java.util.List;

public class CollectionsThirdOptionalTask {
    public static void main(String[] args) {
        List<String> poemList = new ArrayList<>();
        poemList.add("Мои мечты стремятся вдаль,");
        poemList.add("Где слышны вопли и рыданья,");
        poemList.add("Чужую разделить печаль");
        poemList.add("И муки тяжкого страданья.");
        poemList.add("Я там могу найти себе");
        poemList.add("Отраду в жизни, упоенье,");
        poemList.add("И там, наперекор судьбе,");
        poemList.add("Искать я буду вдохновенья.");

        poemList.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println("The poem after sort: " + poemList);
    }
}
