package MusicPlayer;

public class Song implements Comparable<Song>{

        private String title;
        private Artist artist; //instead of String, artist has to be here
        private int duration;
        private int counter; // countHowManyTimesSongHasPlayed

        public Song(String title, Artist artist, int duration, int counter) { // user wont enter the count, so it shouldnt be in this
                                                                 // line
            this.title = title;
            this.artist = artist;
            this.duration = duration;
            this.counter = counter;
        }

        public boolean incrementCounter() { // when song plays
            counter++;
            return true;
        }

        public String getTitle() {
            return title;
        }

        public Artist getArtist() {
            return artist;
        }

        public int getDuration() {
            return duration;
        }

        public int getCounter() {
            return counter;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == this){
                return true;
            }
            if (obj instanceof Song){ //check what the user entered, check the type
                return true;
            }
            Song castedSong = (Song) obj;//if passes both ifs before, come here and cast

            return this.getTitle().equals(castedSong.getTitle()) && this.getArtist().equals(castedSong.getArtist()) && this.getDuration() == castedSong.getDuration();
        }

        @Override
        public int hashCode() { //I made it just zero and only the first song was added to playlist

            return this.title.hashCode() | this.artist.hashCode() | this.duration;

        }

        public void setCounter(int counter) {
            this.counter = counter;
        }
        //which object will be coming in which place and how to compare direction of objects

        @Override 
        public int compareTo(Song s){
            //return counter - s.counter; //if counter of current song is less than the song being passes, it will return -ve value, if they are equal, we get zero, if greater +ve; if counter is less, the song will get a sequence number which is lower (the song will be higher up in the sorting order), when counter increases the object will be places lower down
            if (this.counter < s.counter){
                return -1;
            } if (this.counter == s.counter){
                return 0;
            } 
            return 1;
        }

}