public class vowel {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Empty input. Please enter a valid string.");
            return;
        }

        boolean hasLetter = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                hasLetter = true;
                break;
            }
        }

        if (!hasLetter) {
            System.out.println("Input is not a string (no letters). Detected input: " + input);
            return;
        }

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char lc = Character.toLowerCase(ch);
                if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
