public class Tomato extends Flower{

    public Tomato() {
        super("Toamto", 7, 1, 45);
    }

    @Override
    public void waters() {
        this.chanceOfGrowth += 5;
    }
}
