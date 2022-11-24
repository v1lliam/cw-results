package Java.Leetcode;

import java.util.HashMap;

public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) { 
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            
            int currentCount = magazineLetters.getOrDefault(magazine, 0);
            magazineLetters.put(m, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);

            if (currentCount == 0) {
                return false;
            }

            magazineLetters.put(r, currentCount - 1);
        }

        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) { 
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }

            magazine = magazine.substring(0, i) + magazine.substring(i + 1);
        }

        return true;
    }
}
