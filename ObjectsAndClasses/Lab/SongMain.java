package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String songsInput = scanner.nextLine();
            String[] songsData = songsInput.split("_");
            Song song = new Song(songsData[0], songsData[1], songsData[2]);
            songList.add(song);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : songList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songList) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
