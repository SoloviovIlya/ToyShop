package ToyStore;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;


public class ProgramMain {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("Toys.txt", true))
        { 
            writer.write("Начнём розыгрыш:");
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        Toy toy1 = new Toy(0, "Кукла", 3, 43);
        Toy toy2 = new Toy(1, "Зайчик", 2, 12);
        Toy toy3 = new Toy(2, "Солдатик", 5, 22);
        Toy toy4 = new Toy(3, "Машинка", 6, 76);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }
    
    
}
