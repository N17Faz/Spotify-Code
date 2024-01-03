package Spotify;

public class Tune {
    private String title;
    private String artist;
    private int playcount;
    

    public Tune(String title, String artist, int playcount) {
        this.title = title;
        this.artist = artist;
        this.playcount = playcount;
        
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlaycount() {
        return playcount;
    }
}