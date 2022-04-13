package Statements;

public class Main {

    public static void main(String[] args) {

        // *** 3 types of Statements in Java ***

        // 1)declaration statement
        int finalScore = 50;
        int playersHighScore;

        // 2) expression statement(s)
        //      A) Assignment expressions
        int calculatedScore = finalScore = 60;
        System.out.println("calculatedScore = " + calculatedScore);

        finalScore = 70;

        //       B) Increment operator
        int playerLives = 3;

        System.out.println("Lives remaining = " + playerLives--); // outputs 3
        System.out.println("playerLives with postfix = " + playerLives); // outputs 2
        System.out.println("playerLives with prefix = " + --playerLives); // outputs 1

        //      C) method calls
        System.out.println("Testing");

        //      D) Object creation expressions
//        Car ownersCar = new Car();

        // 3) Control-Flow Statements
            // these include if-then-else, looping statements (for, while and do-while)
            // and branching statements (break, continue and return)

        if(calculatedScore > 59) {
            System.out.println("I calculate your score as being more than 59");
        } else {
            System.out.println("Your score is 59 or less");
        }


    }
}
