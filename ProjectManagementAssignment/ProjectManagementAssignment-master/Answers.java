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
    public void read(){
        String[] answers = new String[0];
        String ans = "";
        //counts how many times it loops
        int i = 0; 
        try{
            FileReader file = new FileReader("src\\Answers.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                //gets each answer and puts it in an array
                ans = scan.next();
                answers[i] = ans;
                i++;
               
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Error: " + e);
        }
        //takes the answers and puts them through sort
        sort(ans);
        Output(ans);
    }
     public String[] getFind2() {
        return find2;
    }

    public void setFind2(String[] find2) {
        this.find2 = find2;
    }

    public String[] getFind() {
        return find;
    }

    public void setFind(String[] find) {
        this.find = find;
    }

    public String[] getFind3() {
        return find3;
    }

    public void setFind3(String[] find3) {
        this.find3 = find3;
    }

    public String[] getFind4() {
        return find4;
    }

    public void setFind4(String[] find4) {
        this.find4 = find4;
    }

    public String[] getFind5() {
        return find5;
    }

    public void setFind5(String[] find5) {
        this.find5 = find5;
    }
    public String sort(String ans){
        //takes all the answers with certain numbers 
        if(ans.startsWith("2")){

        }
        if(ans.startsWith("3")){
            find2[0] = ans;
    }
        if(ans.startsWith("5")){
            find3[0] = ans;
    }
        if(ans.startsWith("8")){
            find4[0] = ans;
    }
        if(ans.startsWith("9")){
            find5[0] = ans;
    }
        
    return ans;
   }
    public String Output(String str){
        String findAnswer = "";
        String[] store[] = {find,find2,find3,find4,find5};
        findAnswer = str + "" + store;
        return findAnswer;
    }
}
