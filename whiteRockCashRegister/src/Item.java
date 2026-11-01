public class Item {

    String name;
    double price;


    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String toString() {
        return  " " + name + " " + "- R$ " + price;
    }

    String getName() {
        return name;
    }





}
