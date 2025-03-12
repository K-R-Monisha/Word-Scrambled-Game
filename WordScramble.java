import java.util.*;

public class WordScramble {
    private static String[] words = {
        "JAVA", "PYTHON", "COMPUTER", "PROGRAM", "CODING", "VARIABLE", "FUNCTION", 
        "ALGORITHM", "SOFTWARE", "DEVELOPER", "KEYBOARD", "MONITOR", "LAPTOP", 
        "ENGINEER", "INTERNET", "DATABASE", "PROCESSOR", "MEMORY", "GRAPHICS",
        "ELEPHANT", "GIRAFFE", "KANGAROO", "PENGUIN", "TIGER", "ZEBRA", "OSTRICH",
        "PIZZA", "BURGER", "SANDWICH", "PASTA", "NOODLES", "CHOCOLATE", "STRAWBERRY",
        "JUPITER", "MERCURY", "SATURN", "PLANET", "GALAXY", "ASTEROID", "NEBULA",
        "LIBRARY", "SCHOOL", "TEACHER", "STUDENT", "EXAMINATION", "SUBJECT",
        "HOSPITAL", "DOCTOR", "MEDICINE", "SURGERY", "PATIENT"
    };
    
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = words[random.nextInt(words.length)];
        String scrambled = shuffle(word);

        System.out.println("🔠 Unscramble the word: " + scrambled);
        System.out.print("Your answer: ");
        String guess = scanner.nextLine().toUpperCase();

        if (guess.equals(word)) {
            System.out.println("🎉 Correct! You unscrambled it.");
        } else {
            System.out.println("❌ Wrong! The correct word was: " + word);
        }
    }

    private static String shuffle(String word) {
        List<Character> letters = new ArrayList<>();
        for (char c : word.toCharArray()) letters.add(c);
        Collections.shuffle(letters);

        StringBuilder shuffled = new StringBuilder();
        for (char c : letters) shuffled.append(c);
        return shuffled.toString();
    }
}
