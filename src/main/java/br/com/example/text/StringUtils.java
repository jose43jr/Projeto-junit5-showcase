package br.com.example.text;

public class StringUtils {
    public static boolean hasText(String s) {
        return s != null && !s.trim().isEmpty();
    }
    public static boolean isSimplePalindrome(String s) {
        if (s == null) return false;
        String normalized = s.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(normalized).reverse().toString().equals(normalized);
    }
}
