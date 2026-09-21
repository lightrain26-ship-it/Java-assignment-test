import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readByUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CSV file name (e.g. customer.csv): ");
        String fileName = input.nextLine();

        File readFile = new File(fileName);

        try (Scanner myReader = new Scanner(readFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found - " + fileName);
        }
    }
}