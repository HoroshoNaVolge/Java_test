import java.util.ArrayList;

class Program {
    public static void main(String[] args) {

        ArrayList<Toy> toys = ToyFactory.createToys(5);

        for (Toy toy : toys)
            System.out.println(toy.toString());
    }
}