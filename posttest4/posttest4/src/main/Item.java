package main;
public class Item {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (Rp " + price; 

    }
    public void DataPenjualanProduk(String nama){
    System.out.println("nama :" + nama);
    }
    public void DataPenjualanProduk(int harga){
    System.out.println("harga :" + harga);
    }
}
    