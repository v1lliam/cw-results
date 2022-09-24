package Java.cw11;

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) { 
        int s = 1;
        List<String> nLines = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String x = lines.get(i);
            String s1 = Integer.toString(s);
            nLines.add("" + s1 + ": " + x);
            s++;
        }

        return nLines;
    }

    public static void main(String[] args) {
        System.out.println(LineNumbering.number((Arrays.asList("a", "b", "c"))));
    }
}
