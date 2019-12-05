/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elatt1253
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Answers {
    //find the answers
    public String[] find2;
    public String[] find;
    public String[] find3;
    public String[] find4;
    public String[] find5;
    public String[] store;
    public String answers;

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
    /**
     * If the answer is appears more than once store in an array
     * 
     */
    public Answers(){
    }
    public void read(String arr[]){
        String answers;
        //counts how many times it loops
        int i = 0; 
        try{
            FileReader file = new FileReader("src\\Answers.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                answers = scan.next();
                i++;
                
                if(answers.startsWith("2")){
                    find[i] = answers;
                    
                }
                if(answers.startsWith("3")){
                    find3[i] = answers;
                    
                }
                if(answers.startsWith("5")){
                    find4[i] = answers;
                    
                }
                if(answers.startsWith("8")){
                    find5[i] = answers;
                    
                }
                if(answers.startsWith("9")){
                   find2[i] = answers;
                    
                }
               
            }
        }catch(FileNotFoundException e){
            System.out.println("Error: " + e);
        }
    }
    
}
