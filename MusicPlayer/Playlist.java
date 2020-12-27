package MusicPlayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


public class Playlist {
    private String name;
    HashSet<Song> playlist; //cant have two of the same with hashset

    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedHashSet<>(); //maintains the insertion order
    }

    public String getName() {
        return name;
    }

    public int totalDuration(){
        {   
            int result = 0; //cant be inside of the loop!
            for(Song song : playlist){
                result = result + song.getDuration();
            }
            return result;
        }
    }  

    public boolean add(Song song){
        return playlist.add(song);
    }

    public boolean playAllSongs(Sorter s){
        List<Song> playlist = s.sort(this); //I sort it in the RHS and then it will go into the newly created playlist, in line 41, I will print that playlist one by one
        System.out.println(" ");
        System.out.println("These songs are playing: ");
        System.out.println(" ");
        for(Song song : playlist){
            System.out.print(song.getTitle() + " by " + song.getArtist().getName() + " lasting " + song.getDuration() + " seconds"); //just writing playlist here prints: Song@7bac7eff for Song1
            song.incrementCounter();
            System.out.println(" ");
            System.out.println(" ");
        }
        return true;
    }

    public HashSet<Song> getPlaylist() {
        return playlist;
    }


}