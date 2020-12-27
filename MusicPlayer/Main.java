package MusicPlayer;

public class Main {
    public static void main(String[] args){

        Artist artist1 = new Artist("Lord of the Puppies");
        Artist artist2 = new Artist("A.P.P.L.E.");
        Artist artist3 = new Artist("Flight of the Men");

        Song song1 = new Song("nr 1 Classic hit played 10x", artist1, 180, 10);
        Song song2 = new Song("nr 2 Christmas carol played 1x", artist2, 200, 1);
        Song song3 = new Song("nr 3 Summertime played 30x", artist3, 160, 30);

        DefaultSorter myDefaultSorter = new DefaultSorter();
        ShuffleSorter myShuffleSorter = new ShuffleSorter();
        PlayCountSorter myPlayCountSorter = new PlayCountSorter();

        Playlist playlist1 = new Playlist("Random mix");

        playlist1.add(song1);
        playlist1.add(song2);
        playlist1.add(song3);

        song1.setCounter(10);
        song2.setCounter(1);
        song3.setCounter(30);

        System.out.println("----------------------------");
        System.out.println(" ");
        System.out.println("This playlist will last: " + playlist1.totalDuration() + " seconds"); //playlist1.getDuration()

        System.out.println("DEFAULT");
        playlist1.playAllSongs(myDefaultSorter);
        System.out.println("----------------------------");
        System.out.println("SHUFFLE");
        playlist1.playAllSongs(myShuffleSorter);
        System.out.println("----------------------------");
        System.err.println("BY COUNT");
        playlist1.playAllSongs(myPlayCountSorter);

        System.out.println("----------------------------");


    }  
}