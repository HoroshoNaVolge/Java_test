import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ToyStock {

    protected ArrayList<Toy> toys;
    protected ArrayList<Toy> prizeToys;

    public ToyStock(ArrayList<Toy> toysForStock) {
        toys = toysForStock;
        prizeToys = new ArrayList<>();

    }

    public void setToyWeight(int id, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void play() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        Random rnd = new Random();
        double randomNumber = rnd.nextDouble(1, totalWeight);

        Toy prizeToy = null;
        for (Toy toy : toys) {
            if (randomNumber < toy.getWeight()) {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getWeight();
        }

        if (prizeToy != null && prizeToy.getQuantity() > 0) {
            prizeToys.add(prizeToy);

            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
        }
    }

    public void getPrizeToy() throws IOException {

        FileWriter writer = new FileWriter("prize_toys.txt", true);

        if (prizeToys.size() > 0) {
            Toy prizeToy = prizeToys.remove(0);
            writer.write("Выпала игрушка! id= "+ prizeToy.getId() + "," + "Название: " + prizeToy.getName() + "\n");

        } else {
            writer.write("В розыгрыше не выпала призовая игрушка" + "\n");
        }
        writer.close();
    }
}
