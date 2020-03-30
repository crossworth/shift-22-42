package br.com.crossworth.shift2242;

public class Shift2242 {
    private static final int startShift = 22;

    public static String encrypt(String text) {
        String input = padRight(text, 10, " ").toUpperCase();
        StringBuilder finalText = new StringBuilder();

        int shift = startShift;

        for (int i = 0; i < 10; i++) {
            char c = (char) (input.charAt(i) + shift);
            finalText.append(c);
            shift += 2;
        }

        return finalText.toString();
    }

    public static String decrypt(String input) {
        if (input.length() != 10) {
            throw new RuntimeException("O texto deve possuir 10 caracteres.");
        }

        StringBuilder finalText = new StringBuilder();

        int shift = startShift;

        for (int i = 0; i < 10; i++) {
            char c = (char) (input.charAt(i) - shift);
            finalText.append(c);
            shift += 2;
        }

        return finalText.toString().trim().toLowerCase();
    }

    public static String padRight(String text, int number, String c) {
        return String.format("%-" + number + "s", text) + c;
    }
}
