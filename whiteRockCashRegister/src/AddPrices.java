import java.util.ArrayList;

public class AddPrices {


    static void add(ArrayList<Item> arr){

        double total = 0;

        for(int i = 0; i < arr.size(); i++) {

            total += arr.get(i).price  ;
        }
        System.out.printf("    - total ficou: R$ %.2f", total);

    }
}
