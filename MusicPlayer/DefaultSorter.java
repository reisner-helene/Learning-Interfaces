package MusicPlayer;

import java.util.ArrayList;
import java.util.List;

public class DefaultSorter implements Sorter {

    @Override
    public List<Song> sort(Playlist p){
        ArrayList<Song> n = new ArrayList<Song>(p.getPlaylist()); 
        return n;
    }

}