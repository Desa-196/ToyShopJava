import java.util.ArrayList;
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
            throw new ToyRandomAddException("Такая игрушка уже участвует в розыгрыше!");
        } else {
            toyArray.add(toy);
            allWeight += toy.getWeight();
        }
    }

    public Toy get() {
        //Генерируем случайное число от 1 до суммы всех весов включительно
        int intRandom = randon.nextInt(1, allWeight + 1);
        int i=0;
        //Будем по очереди брать игрушки из массива и вычитать их вес из сгенерированного случайного числа, и когда 
        //остаток от сгенерированного случайного числа станет равен или меньше нуля, значит мы в диапазоне нужной игрушки
        while (true) {
            intRandom -= toyArray.get(i).getWeight();
            if(intRandom <= 0) break;
            i++;
        }
        return toyArray.get(i);
    }
}
