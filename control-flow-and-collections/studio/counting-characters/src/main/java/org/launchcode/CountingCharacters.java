package org.launchcode;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> countmap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                countmap.put(c, countmap.getOrDefault(c, 0) + 1);
            }

        }


        for (Map.Entry<Character, Integer> entry : countmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
