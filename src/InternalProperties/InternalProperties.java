package InternalProperties;

import java.util.Scanner;

public class InternalProperties {

    private InternalItems item;
    private Scanner sc = new Scanner(System.in);

    public InternalProperties() {
        internalItem();
        setItem();

    }

    public void internalItem() {
        for (InternalItems s : InternalItems.values())
            System.out.println(s.ordinal() + 1 + " - " + s);
    }

    public void setItem() {
        System.out.println("please enter Internal items");
        String items = sc.nextLine();
        String internalItems = items.toUpperCase();
        this.item = (InternalItems.valueOf(internalItems));

    }

    public InternalItems getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Internal Properties : " + item;
    }
}
