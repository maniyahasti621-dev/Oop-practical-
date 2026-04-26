import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        
        System.out.println("--- Adding songs to playlist ---");
        playlist.add("Bohemian Rhapsody");
        playlist.add("Shape of You");
        playlist.add("Blinding Lights");
        playlist.add("Levitating");
        playlist.add("Kesariya");
        displayPlaylist(playlist);
        
        
        System.out.println("\n--- Playing first song ---");
        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst(); 
            System.out.println("Now Playing: " + firstSong);
        } else {
            System.out.println("Playlist is empty!");
        }
        displayPlaylist(playlist);
        
        System.out.println("\n--- Skipping last song ---");
        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast(); 
            System.out.println("Skipped: " + lastSong);
        } else {
            System.out.println("Playlist is empty!");
        }
        displayPlaylist(playlist);
        
        System.out.println("\n--- Adding new song ---");
        playlist.add("Vande Mataram");
        displayPlaylist(playlist);
    }
    
    public static void displayPlaylist(LinkedList<String> playlist) {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
            System.out.println("Total songs: " + playlist.size());
        }
    }
}
