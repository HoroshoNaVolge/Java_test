public class Toy {

    protected int id;
    protected String name;
    protected int dropChance;
    protected int price;

    public int getId() {
        return id;
    }

    public void setId (int id)
    {
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getDropChance(){
        return dropChance;
    }

    public void setDropChance(int dropChance)
    {
        this.dropChance=dropChance;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }

    @Override
    public String toString(){
        return "Toy id= " + id + ". Name: " + name + ". Price: " + price;
    }
}
