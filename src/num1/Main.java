package num1;
public class Main {


    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Shield shield = new Shield("Perisai", 1000, 500);
        shield.showDetailAttributes();
        shield.planToBuy(5);

        Sword sword = new Sword("Pedang", 2000, 200);
        sword.showDetailAttributes();
        sword.planToBuy(1);
        inventory.add(shield);
        inventory.add(sword);

    }

}
