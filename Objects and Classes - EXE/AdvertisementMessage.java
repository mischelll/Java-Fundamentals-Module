package JavaFundamentalsExe;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();


        int number = Integer.parseInt(in.nextLine());

        for (int i = 0; i < number;i++){
            int rndPhrase = rnd.nextInt(phrases.length);
            int rndEvent = rnd.nextInt(events.length);
            int rndAuthors = rnd.nextInt(authors.length);
            int rndCities = rnd.nextInt(cities.length);

            System.out.printf("%s %s %s - %s\n",phrases[rndPhrase],events[rndEvent],authors[rndAuthors],cities[rndCities]);


        }

    }
}
