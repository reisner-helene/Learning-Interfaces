package MusicPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayCountSorter implements Sorter { //Songs are played in decreasing order of their play count

    @Override
    public List<Song> sort(Playlist p){
        ArrayList<Song> n = new ArrayList<Song>(p.getPlaylist()); 
        Collections.sort(n); 
        return n;
    }

}