package ObjectsAndClasses.Exercise;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class T01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] phrase = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        List<String> outputList = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i <= 3; i++) {
            int phrasePosition = random.nextInt(phrase.length);
            int eventPosition = random.nextInt(event.length);
            int authorPosition = random.nextInt(author.length);
            int cityPosition = random.nextInt(city.length);

            String outPhrase = phrase[phrasePosition];
            String outEvent = event[eventPosition];
            String outAuthor = author[authorPosition];
            String outCity = city[cityPosition];

            System.out.printf("%s %s %s - %s%n", outPhrase, outEvent, outAuthor, outCity);
        }
    }
}
