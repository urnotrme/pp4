import java.util.*;
public class Zajecia {
    ArrayList<String> studenci = new ArrayList<String>();
    String imie;
    
    public void zapiszStudenta(String imie){
        if (studenci.size()<=10){
            studenci.add(imie);
        }
        else {
            System.out.println("The class is full!");
        }
    }
    public String infoLista(){
        return "Students in the class are: "+String.join(", ", studenci);
    }
    public static void main(String[] args) {
        Zajecia lista = new Zajecia();
        int n = 0;
        while (n<10){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter student's name: ");

            String name = myObj.nextLine();
            lista.zapiszStudenta(name);
            n++;
        }
        System.out.println(lista.infoLista()); 
    }
}
