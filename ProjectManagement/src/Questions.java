import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questions {
    public String array[];
    public Questions(String arr[]){
        array = arr.clone();
    }
    public void read(String arr[]){
        try{
            File file = new File("src\\questions.txt");
            Scanner scan = new Scanner(file);
            int i = 0;
            while(scan.hasNext()){
                array[i] = scan.nextLine();
                i++;
            }
            
        }catch(FileNotFoundException e){
            
        }
    }
}
