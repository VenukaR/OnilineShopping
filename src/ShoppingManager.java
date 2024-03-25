import java.util.Scanner;

public interface ShoppingManager {
    void addProduct(Product product);

    void deleteProduct(Scanner input);

    void printList();

    void saveToFile();

    void readFromFile();

    boolean runMenu();

}