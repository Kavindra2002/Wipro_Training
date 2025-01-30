package String_QuestionsHW;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World";
        input = input.toLowerCase();
        int vowels = 0, consonants = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                    default -> consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
