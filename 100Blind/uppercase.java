public class uppercase {
    public static void main(String[] args) {
        String input="hELLO WORLD";
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                found = true;
                System.out.println("Upper case found at " + ch + " index " + i);
            }
        }

        if (!found) {
            System.out.println("No uppercase letters found.");
        }
    }
}
