import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyRandom {
    private ArrayList<Toy> toyArray = new ArrayList<>();
    private Random randon = new Random();
    private int allWeight = 0;

    public void put(Toy toy) {
        if (toy == null) {
            throw new ToyRandomAddException("Значения null не допускается в качестве параметра");
        }
        if (toyArray.indexOf(toy) != -1) {
            throw new ToyRandomAddException("Такая игрушка у;е участвует в розыгрыше!");
        } else {
            toyArray.add(toy);
            allWeight += toy.getWeight();
        }
    }

    public Toy get() {
        int intRandom = randon.nextInt(1, allWeight + 1);
        for (int i=0; i<toyArray.size(); i++) {
            intRandom -= toyArray.get(i).getWeight();
            if(intRandom <= 0) break;
        }
        return toyArray.get(intRandom);
    }
}
