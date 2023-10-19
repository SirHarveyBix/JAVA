package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Exercise(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }
        Song newSong = new Song(title, duration);
        songs.add(newSong);
        return true;
    }

    private Song findSong(String title) {
        if (!songs.isEmpty()) {
            for (Song songToFind : songs) {
                if (songToFind.getTitle().equals(title)) {
                    return songToFind;
                }
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if (trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        }
        Song songToAdd = songs.get(trackNumber - 1);
        String songToAddTitle = songToAdd.getTitle();
        ListIterator<Song> playListIterator = playList.listIterator();

        while (playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(songToAddTitle) == 0) {
                return false;
            }
        }

        playList.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            return false;
        }

        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                return false;
            }
        }

        playList.add(songToAdd);
        return true;
    }
}

class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
