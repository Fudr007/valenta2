public class Cucumber extends Flower {
    public Cucumber() {
        super("Cucumber", 3, 2, 30);
    }

    @Override
    public void waters() {
        this.chanceOfGrowth += 10;
    }
}
