import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringPrinter stringPrinter = new StringPrinter("Manjeva");

        stringPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(10.10);

        doublePrinter.print();

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
