package DefiningMethods.demo;

public class MethodChallenge {

    public static void main(String[] args) {

        String name1 = "Tim";
        String name2 = "Jason";
        String name3 = "Sid";
        String name4 = "Jim";

        int score1 = calculateHighScorePosition(1500);
        int score2 = calculateHighScorePosition(900);
        int score3 = calculateHighScorePosition(400);
        int score4 = calculateHighScorePosition(50);

        displayHighScore(name1, score1);
        displayHighScore(name2, score2);
        displayHighScore(name3, score3);
        displayHighScore(name4, score4);

    }

    // Create 2 methods

    //1st should be called calculateHighScorePosition
    // It should have one parameter, score which is an int
    // The method should return a value that is calculated based on the score
    // return 1 if the score is >= 1000
    // return 2 if the score is >= 500 and < 1000
    // return 3 if the score is >= 100 and < 500
    // return 4 in all other cases

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    // 2nd method should be called displayHighScore
    // it should have 2 parameters, name and position
    // Name is the players name and a String
    // Position is the value return from the first method and represents where in the high score the players score belongs

    public static void displayHighScore(String name, int position) {

        System.out.println(name + " managed to get to position " + position + " on the high score table.");

    }
}
