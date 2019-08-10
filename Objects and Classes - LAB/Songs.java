package JavaFundamnetalsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;




public class Songs {
    static class Song{
        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        private String typeList;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        private String time;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < num;i++){
            String[] input = in.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);

        }

        String typeList = in.nextLine();

        if (typeList.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }

        }




    }

}
