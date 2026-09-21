import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testToRead{
    public static void main(String[] args){
        File readFile = new File("customer.csv");

        try (Scanner myReader = new Scanner(readFile)){
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("Error of reading!");
        }
    }
}