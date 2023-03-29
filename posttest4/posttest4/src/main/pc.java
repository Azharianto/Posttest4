package main;

public class pc extends Item{
    int idpc;
    String status;
    public pc(String nama, int price,int idpc,String status) {
        super(nama, price);
        this.idpc = idpc;
        this.status = status;
}
public String getStatus() {
    return status;
}

public int getIdpc() {
    return idpc;
}
public void setIdpc(int idpc) {
    this.idpc = idpc;
}

public void setStatus(String status) {
    this.status = status;
}
    public void DataPenjualanProduk(String nama){
    System.out.println("nama :" + nama);
    }
    public void DataPenjualanProduk(int harga){
    System.out.println("harga :" + harga);
    }
    public Object get(int i) {
        return null;
    }

}
