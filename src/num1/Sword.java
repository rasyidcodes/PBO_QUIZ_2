package num1;

public class Sword extends Item{
    //define damage
    private int damage;
    public Sword(String nama, int price, int damage) {
        super(nama, price);
        this.damage = damage;
    }


    @Override
    public void showDetailAttributes() {
        System.out.println("This " + super.getNama() +" damages " + damage);
    }

    @Override
    public void planToBuy(int jumlah) {
        System.out.println("You have to pay " + jumlah * super.getPrice());
    }
}
