package classes.sentenceStructure;

import classes.sentenceStructure.enums.Action;
import classes.sentenceStructure.enums.Gender;

import java.util.Arrays;
import java.util.Objects;

public class ListOfThings {
    private final String[] items;

    public ListOfThings(String[] items) {
        if (items.length == 0) {
            throw new IllegalArgumentException("Чтобы перечислить состав группы, она не должна быть пустой.");
        }
        this.items = items;
    }

    public String[] getItems() {
        return items;
    }

    public void printList() {
        System.out.print(String.join(", ", items));

    }

    public String getItemsAsString() {
        return String.join(", ", items);
    }

    @Override
    public String toString() {
        return "ListOfThings{items=" + Arrays.toString(items) + "}";
    }
}