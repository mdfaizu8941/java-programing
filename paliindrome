 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PC {

    public static void main(String[] args) {
        String file = "/home/geu/pallindrome.txt"; 
        try {
            int palindromeCount = countPalindrome(file);
            System.out.println("Number of palindromes are: " + palindromeCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static int countPalindrome(String file) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty() && isPalindrome(word)) {
                        count++;
                         System.out.println(word);   
                    }
                }
            }
        }
        return count;
    }

  
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

