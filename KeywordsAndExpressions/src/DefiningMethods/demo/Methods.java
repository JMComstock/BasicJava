package DefiningMethods.demo;

public class Methods {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {

        if (isGameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}