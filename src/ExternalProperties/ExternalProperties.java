package ExternalProperties;

import java.util.Scanner;

public class ExternalProperties {

    private ExternalItems item;
    private Scanner sc = new Scanner(System.in);

    public ExternalProperties() {
        externalItem();
        setItem();
    }

    public void externalItem() {
        for (ExternalItems s : ExternalItems.values())
            System.out.println(s.ordinal() + 1 + " - " + s);
    }

    public void setItem() {
        System.out.println("please enter External items");
        String items = sc.nextLine();
        String vehicaleItems = items.toUpperCase();
        this.item = (ExternalItems.valueOf(vehicaleItems));

    }

    public ExternalItems getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "External Properties : " + item;
    }
}
