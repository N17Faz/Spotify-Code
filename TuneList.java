package Spotify;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TuneList {
    
    private String title;
    private String artist;
    private int playcount;

    public void TuneList(String title, String artist, int playcount) {
        this.title = title;
        this.artist = artist;
        this.playcount = playcount;
    }

   private ArrayList<Tune> tunes = new ArrayList<Tune>();
private String answer2;


   public TuneList() {
    tunes.add(new Tune ("The Chain", "Fleetwood Mac", 28250850));
    tunes.add(new Tune ("Sacrifice", "The Weeknd", 52344054));
    tunes.add(new Tune ("Popular", "The Weeknd, Playboi Carti, Madonna", 67542232));
    tunes.add(new Tune ("MONEY AND VIBES", "Nemzzz", 12345678));
    tunes.add(new Tune ("BUTTERFLY EFFECT", "Travis Scott", 96433362));
    tunes.add(new Tune ("Run To You", "Bryan Adams", 77392269));
    tunes.add(new Tune ("Money Trees", "Kendrick Lamar, Jay Rock", 34556723));
    tunes.add(new Tune ("Assumptions", "Sam Gellaitry", 87785665));
    tunes.add(new Tune ("Slide Away", "Oasis", 99903456));
    tunes.add(new Tune ("Ecstasy", "Rose Gray", 12236754));

   }

public void printTunes() {
    for (Tune printTune : tunes) {
        System.out.println ("  Title: " + printTune.getTitle() + "  Artist: " + printTune.getArtist() + "  Playcount: " + printTune.getPlaycount());
    }
}

public void removeTune() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the name of the tune you wish to remove?");
    String title = scanner.nextLine();
    System.out.println("What is the name of the artist you wish to remove?");
    String artist = scanner.nextLine();

    Iterator<Tune> iterator = tunes.iterator();
    while (iterator.hasNext()) {
        Tune currentTune = iterator.next();
        if (currentTune.getTitle().equals(title) || currentTune.getArtist().equals(artist)) {
            iterator.remove();
    
            System.out.println("Tune successfully removed!");

        
    }
}
    
}

public void addTune () {
    
    Scanner scanner = new Scanner (System.in);
    System.out.println ("What is the title of the tune to wish to add?");
    String title = scanner.nextLine();
    System.out.println ("What is the artist's name?");
    String artist = scanner.nextLine();
    System.out.println ("What is the number of playcounts for this tune?");
    int playcount = scanner.nextInt();
    Tune newTune = new Tune (title, artist, playcount);
    tunes.add (newTune);
    System.out.println ("Tune added successfully!");

}

public void showPlaycount() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a maximum playcount using 8 digits");
        int playcount = scanner.nextInt();
        System.out.println("Here is a list of songs with a maximum plays of " + playcount);
        if (playcount >= 0 && playcount <= 99999999) {
            
            for (Tune tune : tunes) {
                if (tune.getPlaycount() <= playcount) {
                
            
            System.out.println ("  Title: " + tune.getTitle() + "  Artist: " + tune.getArtist() + "  Playcount: " + tune.getPlaycount());

            }  
        } 
    }
}

}
        
    

    

        



    



