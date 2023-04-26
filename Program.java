import java.io.IOException;
import java.util.ArrayList;

class Program {
    public static void main(String[] args) {

        // Создаём игрушки через фабрику.
        ArrayList<Toy> toysForStock = ToyFactory.createToys(5);

        ToyStock stock = new ToyStock(toysForStock);

        // Для наглядности, в ТЗ было условие создать метод установки веса.
        stock.setToyWeight(1, 5);

        stock.play();

        try {
            stock.getPrizeToy();
            System.out.println("Результат розыгрыша записан в prize_toys.txt");
        } catch (IOException ex) {
            System.out.println("Произошла ошибка записи файла");
        } finally {
            System.out.println("Программа завершена.");
        }

    }
}