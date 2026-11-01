import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        boolean running = true;
        Scanner userInput = new Scanner(System.in);


        ArrayList<Item> inventory = new ArrayList<>();
        ArrayList<Item> listaDeCompras = new ArrayList<>();

        Item beans = new Item("Feijão",10.99);
        Item rice = new Item("Arroz",3.99);
        Item meat = new Item("Carne",14.99);
        Item bread = new Item("Pão",5.49);
        Item soda = new Item ("Coca-cola 2L",7.99);
        Item ps5 = new Item("PlayStation 5 DESBLOQUEADO",5000.99);

        inventory.add(beans);
        inventory.add(rice);
        inventory.add(meat);
        inventory.add(bread);
        inventory.add(soda);
        inventory.add(ps5);


        while (running) {

            System.out.println(" ");
            System.out.println("Nossos produtos: \n ");

            for(Item item: inventory) {

                System.out.println("- " + item);
            }

            System.out.print("\n O que gostaria de comprar?  ");
            String product = userInput.nextLine();

            for (Item item : inventory) {

                if (item.getName().toLowerCase().contains(product.toLowerCase())) {

                    listaDeCompras.add(item);

                    System.out.println("\n Sua lista está assim agora: \n" + " - " +listaDeCompras);
                }

            }

            System.out.print("\n - Gostaria de comprar mais alguma coisa? ( S / N )? ");
            String userResponse = userInput.nextLine();
            if(userResponse.equalsIgnoreCase( "n")){
                running = false;
                System.out.println(" ");
                System.out.println("    - Você comprou os itens: " + listaDeCompras + "\n");
                AddPrices.add(listaDeCompras);
            }


        }


    }
}
