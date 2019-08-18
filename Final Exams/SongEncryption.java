package MidExams;

import java.util.Scanner;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        while (!command.equals("end")) {
            StringBuilder encrtypted = new StringBuilder();
            String[] data = command.split(":");
            String artist = data[0];
            String song = data[1];

            boolean validArtist = validArtist(artist);
            boolean validSong = validSong(song);

            if (!validArtist || !validSong) {
                System.out.println("Invalid input!");
            } else {
                int key = artist.length();
                encrtypted.append(encrryptArtist(artist, key));
                encrtypted.append(encryptSong(song, key));
                System.out.printf("Successful encryption: %s\n", encrtypted.toString());
            }

            command = in.nextLine();
        }
    }

    static boolean validArtist(String artist) {
        if (!Character.isUpperCase(artist.charAt(0))) {
            return false;
        }

        for (int i = 1; i < artist.length(); i++) {
            char letter = artist.charAt(i);
            if (!(Character.isLowerCase(letter) || letter == ' ' || letter == '\'')) {
                return false;
            }
        }
        return true;
    }

    static boolean validSong(String song) {
        for (int i = 0; i < song.length(); i++) {
            char letter = song.charAt(i);
            if (!(Character.isUpperCase(letter) || letter == ' ')) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder encrryptArtist(String artist, int key) {
        StringBuilder sb = new StringBuilder();
        char c = (char) (artist.charAt(0) + key);
        if (c > 90) {
            c = (char) ((artist.charAt(0) + key) - 26);
            sb.append(c);
        } else {
            sb.append(c);
        }
        for (int i = 1; i < artist.length(); i++) {
            if (artist.charAt(i) == ' ' || artist.charAt(i) == '\'') {
                sb.append(artist.charAt(i));
                continue;
            }
            char m = (char) (artist.charAt(i) + key);
            if (m > 122) {
                m = (char) ((artist.charAt(i) + key) - 26);
                sb.append(m);
            } else {
                sb.append(m);
            }

        }

        sb.append('@');
        return sb;
    }

    static StringBuilder encryptSong(String song, int key) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < song.length(); i++) {
            if (song.charAt(i) == ' ' || song.charAt(i) == '\'') {
                sb.append(song.charAt(i));
                continue;
            }

            char m = (char) (song.charAt(i) + key);
            if (m > 90) {
                m = (char) ((song.charAt(i) + key) - 26);
                sb.append(m);
            } else {
                sb.append(m);
            }
        }
        return sb;
    }
}
