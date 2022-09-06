import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  
public class ListaCasamento {
  
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	
        List<listaNoivo> list1 = new ArrayList<listaNoivo>();
        //listaNoivo noivo = new listaNoivo();
        String resp;
        
        do {
        	System.out.println("Digite um nome para a lista de casamento: ");
        	list1.add(new listaNoivo(in.nextLine()));
        	
        	System.out.println("Deseja digitar outro nome? 'se SIM digite s' ");
            resp = in.nextLine();
        } while (resp.equalsIgnoreCase("s"));
        
        
        
        
        // creating new empty list
        List<String> concatenated_list
            = new ArrayList<String>();
  
        // using addAll( ) method to concatenate the lists
        //concatenated_list.addAll(list1);
        //concatenated_list.addAll(list2);
  
        for (listaNoivo noivo: list1) {
        System.out.println("list1: " + list1);}
        //System.out.println("list2: " + list2);
        System.out.println("Concatenated list: "
                           + concatenated_list);
    }
}