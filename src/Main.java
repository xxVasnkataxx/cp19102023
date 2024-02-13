import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the ArrayList
        printList(Collections.singletonList(numbers));

        // Create an ArrayList of strings
        List<String> strings = new ArrayList<>();

        // Print the ArrayList
        printList(Collections.singletonList(strings));
    }

    // This method prints the contents of an ArrayList to the console
    public static void printList(List<Object> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}


class StringPrinter {

    private String thingToPrint;

    public StringPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

class DoublePrinter {

    private double thingToPrint;

    public DoublePrinter(double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
