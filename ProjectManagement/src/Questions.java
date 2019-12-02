import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questions {


    //Creates a new array of strings called questionArray.
    public String questionArray[];
 

    //Sets the questionArray to the clone of the inputted array of strings.
    public Questions() {
        read();
    }

    //Reads in the questions dataFile and adds them to the questionArray.
    public void read() {
        try {
            File f = new File("src\\questions.txt");
            Scanner s = new Scanner(f);
            int i = 0;
            while (s.hasNextLine()) {
                questionArray[i] = s.nextLine();
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error " + e);
        }        
        
    }
    
    public void setQuestion(String newQuestion, int questionNum){
        
        //Sets the specified question to the new String that has been inputted.
        questionArray[questionNum-1] = newQuestion;
    }
    
    public String getQuestion(int questionNum){
        
        //Returns the question the user wants to see.
        return questionArray[questionNum-1];
    }
    
}