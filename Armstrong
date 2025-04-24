 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {

    public static void main(String[] args) {
        String file = "/home/geu/armstrong.txt"; 
        try {
            int armstrongCount = countArmstrong(file);
            System.out.println("Number of Armstrong numbers are: " + armstrongCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static int countArmstrong(String file) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty() && isArmstrong(word)) {
                        count++;
                        System.out.println(word);   
                }
            }
        }
        return count;
    }
}
 public static boolean isArmstrong(String word) {
        try {
            int num = Integer.parseInt(word);   
            int sum = 0;
            int t = num;
            int digits = word.length(); 

            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits); 
                num /= 10;
            }

            return sum == t;
        } catch (NumberFormatException e) {

            return false;
        }
    }
}


