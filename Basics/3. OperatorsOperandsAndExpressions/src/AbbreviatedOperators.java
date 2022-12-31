public class AbbreviatedOperators {

    public static void main(String[] args) {

        /*
            Many times we come across cases where we need to compact operators for better code readability, to squeeze
            it in an expression, or to update a variable.

            This is where Abbreviated operators come in handy
        */

        int points = 4;
        points += 2; // This is the same as points = points + 2;
        System.out.println("points: " + points);
        /* [Special Case]: When you just want to add or subtract one from a variable you can just use two ++ or two --
            to achieve th same goal but in a more compact manner */
        points++; // This is the same as points += 1; or points = points + 1;
        System.out.println("points: " + points);


        int lives = 5;
        lives -= 2; // This is the same as lives = lives - 2;
        System.out.println("lives: " + lives);
        /* [Special Case]: When you just want to add or subtract one from a variable you can just use two ++ or two --
            to achieve th same goal but in a more compact manner */
        points--; // This is the same as lives += 1; or lives = lives + 1;
        System.out.println("lives: " + lives);

        System.out.println("____________________");

        int num = 12;
        num *= 2; // This is the same as num = num * 2;
        System.out.println("num: " + num);

        num /= 4; // This is the same as num = num / 4;
        System.out.println("num: " + num);

        num %= 4; // This is the same as num = num % 4;
        System.out.println("num: " + num);



    }

}
