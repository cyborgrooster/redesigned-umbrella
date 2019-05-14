/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dingetje2;

import java.util.Scanner;

/**
 *
 * @author Suman
 */
public class Dingetje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //alles maar in een aparte method stoppen omdat het beter staat lol
        loginSim();
    }  
    
    public static void loginSim(){
        String gbn = "grasparkiet"; //birb
        String ww = "matcha"; //duur af
        
        Scanner scanDing = new Scanner(System.in); //yay scanner
        System.out.println("> Voer gebruikersnaam in:"); // vraag gebruikersnaam
        
        System.out.print("* "); //want dit vind ik veel leuker staan zo.
        String invoer = scanDing.next(); //input in string doen
        
        if(invoer.equals(gbn)){
            System.out.println("> Juiste gebruikersnaam!"); //juiste input
            System.out.println("> Voer wachtwoord in."); //enter yer pw matey
            System.out.print("* "); //again, omdat het leuker staat zo.
            //lijkt ook nog op een echte console zo :P
            invoer = scanDing.next(); // weer om input vragen, met string dit keer
            if(invoer.equals(ww)){
                System.out.println("> Juiste wachtwoord! \n> Ingelogd!"); //juiste ww
            } else{
                System.out.println("> Verkeerde wachtwoord ingevoerd!"); //verkeerde input
            }
        } else if(!invoer.equals(gbn)){
            System.out.println("> Verkeerde gebruikersnaam ingevoerd!"); //verkeerde input
        } else{
            System.out.println("");
        }
    }

}
