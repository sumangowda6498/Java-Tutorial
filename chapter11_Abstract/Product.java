package chapter11_Abstract;

public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode(){
        return "no barcode";
    }
}

/* NOT for instantiation
        Interface cannot be instatiated

   Interfaces are not extended it can only implemented

   Abstract if not implemented
    Any class that implements an interface, must be implement all of its method or it must declare itself abstract

    Abstract methods
        Methods in a interface must be abstract(No explicit declaration needed) or default.
 */
