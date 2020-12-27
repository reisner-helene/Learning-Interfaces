package MusicPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleSorter implements Sorter {
    @Override
    public List<Song> sort(Playlist p){
        ArrayList<Song> n = new ArrayList<Song>(p.getPlaylist()); 
        Collections.shuffle(n); 
        return n;
    }
}