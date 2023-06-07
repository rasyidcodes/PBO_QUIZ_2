package num1;

public class Shield extends  Item{
    //define armour
    private int armour;
    public Shield(String nama, int price, int armour) {
        super(nama, price);
        this.armour = armour;
    }

    //implements
    @Override
    public void showDetailAttributes() {
        System.out.println("This " + super.getNama() +" protects " + armour);
    }

    @Override
    public void planToBuy(int jumlah) {
        System.out.println("You have to pay " + jumlah * super.getPrice());
    }
}
