import java.io.*;
import java.util.*;
 
public class Plik {
    String text;
    public void zapisz(String text){
        try(FileWriter writer = new FileWriter("plik.txt", true))
        {
            writer.write(text+"\n");
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your text: ");

        String text = myObj.nextLine(); 
        Plik plik = new Plik();
        plik.zapisz(text); 
    } 
}