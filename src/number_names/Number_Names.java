/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number_names;
import java.util.Scanner;
/**
 *
 * @author Karen
 */
public class Number_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String output = "Hello World";
        System.out.println(output);
        Scanner kbrd = new Scanner(System.in);
        System.out.println("add text: ");
        String input = kbrd.nextLine();
        output= output + input;
        System.out.println("New text:");
        System.out.println(output);
        
    }
    
}
