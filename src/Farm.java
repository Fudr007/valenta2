import java.lang.reflect.Array;
import java.util.ArrayList;

public class Farm {

    private int money;
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void addAnimal(Animal animal){
        if (){

        }
    }

    public String fullBarn(){
        String reply = "";
        int countB = 0;
        int countS = 0;
        if (animals.isEmpty()){
            return "no";
        }else {
            for (int i = 0; i<animals.size();i++){
                if (animals.get(i).getSize().equals(Size.BIG)){
                    countB++;
                }
                if (animals.get(i).getSize().equals(Size.SMALL)){
                    countS++;
                }
            }
        }
        if (countS == 10){
            reply = "small";
        }
        if (countB == 10){
            reply = "big";
        }
        if (countS == 10 && countB == 10){
            reply = "both";
        }
        return reply;
    }


}
