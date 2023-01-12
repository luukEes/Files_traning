import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text1.txt");  /**  file "text1" need to be in the same direction as a main !!!**/
        Scanner scan  = new Scanner(file);
        while (scan.hasNextLine()) {
          String s =  scan.nextLine();
            System.out.println(s);
        }
    }
}
/**
 * this metod scanning input from your file .txt :)
 */