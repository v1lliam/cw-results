package Java.CodeWars.removeChar;

class RemoveChars {
    public static String remove_1(String str) {
        return str.substring(0) + str.substring(str.length() - 1);
    }
}
