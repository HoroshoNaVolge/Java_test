import java.util.ArrayList;
import java.util.Random;

public class ToyFactory {

    public static ArrayList<Toy> createToys(int quantity) {
        Random random = new Random();
        ArrayList<Toy> toyList = new ArrayList<Toy>();

        for (int i = 0; i < quantity; i++) {
            Toy toy = new Toy();
            toy.setId(i);
            toy.setName("Toy " + String.valueOf(i + 1));
            toy.setWeight(random.nextDouble(1, 10));
            toy.setPrice(random.nextInt(500, 3000));
            toyList.add(toy);
        }

        return toyList;
    }
}
