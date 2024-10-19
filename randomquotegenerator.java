import java.util.Random;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        // Array of quotes
        String[] quotes = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "The purpose of our lives is to be happy. - Dalai Lama",
            "Get busy living or get busy dying. - Stephen King",
            "You have within you right now, everything you need to deal with whatever the world can throw at you. - Brian Tracy",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "The best time to plant a tree was twenty years ago. The second best time is now. - Chinese Proverb",
            "You miss 100% of the shots you don't take. - Wayne Gretzky"
        };

        // Create a Random object
        Random random = new Random();

        // Generate a random index
        int index = random.nextInt(quotes.length);

        // Print a random quote
        System.out.println(quotes[index]);
    }
}
