package num1;

public abstract class Item {

    private String nama;
    private int price;

    public Item(String nama, int price) {
        this.nama = nama;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getNama() {
        return nama;
    }

    //Implements to all child class
    public abstract  void showDetailAttributes();
    public abstract  void planToBuy(int jumlah);


}
