
public class Currant extends Flower{

    public Currant() {
        super("Currant", 20, 2, 40);
    }

    @Override
    public void waters(){
        this.chanceOfGrowth += 5;
    }

}

