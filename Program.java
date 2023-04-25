import java.util.ArrayList;

class Program {
    public static void main(String[] args) {

        ArrayList<Toy> toysForStock = ToyFactory.createToys(5);
        ToyStock stock = new ToyStock(toysForStock);
        stock.play();

        try{stock.getPrizeToy();}
        catch (Exception ex){System.out.println("Нет призовой игрушки");};
    }
}