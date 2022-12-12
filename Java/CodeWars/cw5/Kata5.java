package Java.CodeWars.cw5;

public class Kata5 {
    public static String rps(String p1, String p2) {
        
        String s = "scissors";
        String r = "rock";
        String p = "paper";
        String won_1 = "Player 1 won!";
        String won_2 = "Player 2 won!";
        String draw = "Draw!";
        String x = null;

        switch (p1) {
            case "scissors":
                if (p2 == p) {
                    x = won_1;
                } else if (p2 == r) { 
                    x = won_2;
                } else if (p2 == s) { 
                    x = draw;
                }
                break;

            case "rock":
                if (p2 == s) {
                    x = won_1;
                } else if (p2 == p){
                    x = won_2;
                } else if (p2 == r) { 
                    x = draw;
                }
                break;

            case "paper":
                if (p2 == r) { 
                    x = won_1;
                } else if (p2 == s) { 
                    x = won_2;
                } else if (p2 == p) { 
                    x = draw;
                }
                break;
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
    }
}
