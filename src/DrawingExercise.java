import java.util.ArrayList;

public class DrawingExercise {

    public void printOneAsterik() {
        System.out.print("*");
    }

    public void drawAHorizontalLine(int numberOfAsterics) {
        for (int i = 0; i < numberOfAsterics; i++) {
            System.out.print("*");
        }
    }

    public void drawAVerticalLine(int numberOfAstericLines) {
        for (int i = 0; i < numberOfAstericLines; i++) {
            System.out.println("*");
        }
    }

    public void drawTriangle(int triangleAstericHeight) {
        int z = 0;

        for (int i = 1; i <= triangleAstericHeight; i++) {

            drawAHorizontalLine(i);
            System.out.print("\n");
        }
    }


    public void PyramidExercises(int diamondSize) {

        int n;
        int k;

        for (int i = 1; i <= diamondSize; i++) {


            for (k = 1; k <= diamondSize - i; k++) {
                System.out.print(" ");

            }
            k = 1;


            for (n = 1; n <= i; ) {
                System.out.print("*");
                n = n + 1;
            }

            n = 1;

            if (i > 1) {
                for (int extraStars = 1; extraStars < i; extraStars++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

//drawing a perfect diamond

    public void drawDiamond(int triangleSize) {
        int triangleWidth = (triangleSize - 1) * 2 + 1;

        int currentLine = 1;
        int numberOfStars = 1;
        boolean reversing = false;

        while (currentLine > 0) {
            System.out.println(padString((triangleWidth - numberOfStars + 1) / 2, " ", numberOfStars, "*"));

            if (!reversing && currentLine < triangleSize) {
                numberOfStars = numberOfStars + 2;
                currentLine++;
            } else if (currentLine == triangleSize) {
                reversing = true;
                numberOfStars = numberOfStars - 2;
                currentLine--;
            } else {
                numberOfStars = numberOfStars - 2;
                currentLine--;
            }

        }
    }


    public static String padString(int padLength, String padChar, int specialCharLength, String specialChar) {
        String charToDraw = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < padLength + specialCharLength; i++) {
            if (i < padLength) {
                charToDraw = padChar;
            } else {
                charToDraw = specialChar;
            }
            stringBuilder.append(charToDraw);
        }
        return stringBuilder.toString();
    }

    // end of drawing a diamond

    //begin Drawing a diamond with name in it
    public void drawDiamondWithName(int triangleSize, String name) {
        int triangleWidth = (triangleSize - 1) * 2 + 1;

        int currentLine = 1;
        int numberOfStars = 1;
        boolean reversing = false;

        while (currentLine > 0) {

            if (!reversing && currentLine < triangleSize) {
                System.out.println(padString((triangleWidth - numberOfStars + 1) / 2, " ", numberOfStars, "*"));
                numberOfStars = numberOfStars + 2;
                currentLine++;
            } else if (currentLine == triangleSize) {
                System.out.println(name);
                reversing = true;
                numberOfStars = numberOfStars - 2;
                currentLine--;
            } else {
                System.out.println(padString((triangleWidth - numberOfStars + 1) / 2, " ", numberOfStars, "*"));
                numberOfStars = numberOfStars - 2;
                currentLine--;
            }

        }
    }
    // end of drawing a diamond


    public String fizzBuzz(int fizzBuzzNumber) {
        String results = null;

        for (int i = 1; i <= fizzBuzzNumber; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                results = "FizzBuzz";
            } else if (i % 5 == 0) {
                results = "Buzz";
            } else if (i % 3 == 0) {
                results = "Fizz";
            } else {
                results = Integer.toString(i);
            }

            System.out.println(results);
        }

        return results;
    }

    public String primeFactorExercise(int number) {
        String result = "";

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {
                number /= i;
                result += String.valueOf(i);
            }
        }
        return result;
    }
}
