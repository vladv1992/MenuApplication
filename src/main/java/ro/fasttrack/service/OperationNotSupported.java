package ro.fasttrack.service;

public class OperationNotSupported extends Exception{
    private final String name_order;
    private final int table_order;
    private final double price_order;

    public OperationNotSupported(String name_order, int table_order, double price_order) {
        this.name_order = name_order;
        this.table_order = table_order;
        this.price_order = price_order;
    }

    public String getName_order() {
        return name_order;
    }

    public int getTable_order() {
        return table_order;
    }

    public double getPrice_order() {
        return price_order;
    }
}
