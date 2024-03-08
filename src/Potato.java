public class Potato extends Flower{

    public Potato() {
        super("Potato", 5, 3, 35);
    }

    @Override
    public void waters() {
       this.chanceOfGrowth += 2;
    }
}
