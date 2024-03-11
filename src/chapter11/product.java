package chapter11;

public interface product {
    double getPrice();
    void setPrice(double price);
    String  getName();
    void setName(String name);
    String getColour();
    void setColour(String colour);
    default String getBarcode(){
        return "no barcode";
    }
}
