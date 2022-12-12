package Java.CodeWars.cw9;

public class Kata9 {
    public static String repeatStr(final int repeated, final String str) {
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < repeated; i++) {
            sb.append(str);
        }

        String string  = sb.toString();
        return string;
    }

}
