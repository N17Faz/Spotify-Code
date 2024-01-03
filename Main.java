package Spotify;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        int tuneOption;
        String tune;
        TuneList object = new TuneList();
    
    do {
        System.out.println ("Please Select An Option:");
        System.out.println ("Press 1 To Add Tune");
        System.out.println ("Press 2 To Remove Tune");
        System.out.println ("Press 3 To View Full Tune List");
        System.out.println ("Press 4 To View Tunes With A Maximum Playcount");
        System.out.println ("Press 0 To Exit");

        tuneOption = scanner.nextInt();

        if (tuneOption == 1) {
            String answer;
            object.addTune();
            do{
                System.out.println ("Do you want to add another tune?");
                scanner.nextLine();
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("Yes"))
                {   
                    object.addTune();
                } 
                
                
            } while (answer.equalsIgnoreCase("Yes"));
            
         
        } else if (tuneOption == 2) {
            String answer2;
            object.removeTune();


        } else if (tuneOption == 3) {
            System.out.println ("Here is the full list of tunes:");
            object.printTunes();
        


        } else if (tuneOption == 4) {
            object.showPlaycount();
            
        }

    } while (tuneOption != 0);

}
}
    
    
    

