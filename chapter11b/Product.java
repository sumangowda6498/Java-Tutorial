package chapter11b;

public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

   default String getBarcode(){
       return "no Barcode";
   }
}
/*
Interfaces are cannot be instantiated
Interfaces are implemented not extended

Abstarct is not implemented: Anmy class that implemnts any interface must implement all its methods or it must declare its abstarct

Method in Interface must be abstarct(no explicit declarartion needed) or default
 */