import java.util.ArrayList;
import java.util.Scanner;

public class posttest3{
    static ArrayList<Item> itemList = new ArrayList<Item>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n=======================");
            System.out.println("==== Diamond Store ====");
            System.out.println("=======================");
            System.out.println("1. Tambahkan item diamond");
            System.out.println("2. Tampilkan semua item diamond Store");
            System.out.println("3. Ubah Item diamond");
            System.out.println("4. Hapus Item diamond");
            System.out.println("5. Keluar Store");

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    addItem();
                    break;
                case 2:
                    showAllItems();
                    break;
                case 3:
                    editItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih telah berkunjung di store kami");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
                    break;
            }
        }
    }

    public static void addItem() {
        System.out.print("\nMasukkan Nama Item: ");
        String name = scanner.next();
        System.out.print("Masukkan Harga Item: ");
        int price = scanner.nextInt();

        Item item = new Item(name, price);
        itemList.add(item);

        System.out.println("Item berhasil ditambahkan!");
    }

    public static void showAllItems() {
        System.out.println("\nDaftar Item: ");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println((i+1) + ". " + itemList.get(i).toString());
        }
    }

    public static void editItem() {
        showAllItems();
        System.out.print("Pilih nomor item yang ingin diubah: ");
        int itemIndex = scanner.nextInt() - 1;

        if (itemIndex >= 0 && itemIndex < itemList.size()) {
            System.out.print("Masukkan Nama Item Baru: ");
            String newName = scanner.next();
            System.out.print("Masukkan Harga Item Baru: ");
            int newPrice = scanner.nextInt();

            Item item = itemList.get(itemIndex);
            item.setName(newName);
            item.setPrice(newPrice);

            System.out.println("Item berhasil diubah!");
        } else {
            System.out.println("Nomor item tidak tersedia!");
        }
    }

    public static void deleteItem() {
        showAllItems();
        System.out.print("Pilih nomor item yang ingin dihapus: ");
        int itemIndex = scanner.nextInt() - 1;

        if (itemIndex >= 0 && itemIndex < itemList.size()) {
            itemList.remove(itemIndex);
            System.out.println("Item berhasil dihapus!");
        } else {
            System.out.println("Nomor item tidak tersedia!");
        }
    }
}

class Item {
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
}