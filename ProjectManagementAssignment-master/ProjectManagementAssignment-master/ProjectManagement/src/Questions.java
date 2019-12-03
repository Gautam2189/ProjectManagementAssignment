import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questions {

    private String questionArray[];
 

    //Sets the questionArray to the clone of the inputted array of strings.
    public Questions(String arr[]) {
        questionArray = arr;
    }

    public String getQuestion(int questionNum){
        return questionArray[questionNum-1];
    }
    
}