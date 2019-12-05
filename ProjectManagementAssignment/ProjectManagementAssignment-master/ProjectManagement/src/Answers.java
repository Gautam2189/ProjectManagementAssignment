import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Answers {
    private String answerArray[];
    private int x = 0;
    public Answers(String arr[]){
        answerArray = arr;
    }
    public String[] getOptions(String arr[],int questionNum){
        for(int i = 0; i < 4; i++){
            arr[i] = answerArray[i + x];
            x++;
        }
        return arr;
    }

}