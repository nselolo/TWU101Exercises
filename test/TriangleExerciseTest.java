import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TriangleExerciseTest
{

        DrawingExercise drawingExercise = new DrawingExercise();

        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }

        @After
        public void cleanUpStreams() {
            System.setOut(null);
            System.setErr(null);
        }

    @Test
    public void shouldPrintOneAsterik() throws Exception
    {
        drawingExercise.printOneAsterik();

        assertTrue(outContent.toString().equals("*"));
    }

    @Test
    public void shouldDrawAHorizontalLine() throws Exception
    {
        drawingExercise.drawAHorizontalLine(8);
        assertTrue(outContent.toString().equals("********"));
    }

    @Test
    public void shouldDrawAVerticalLine() throws Exception
    {
        drawingExercise.drawAVerticalLine(3);

           assertTrue(outContent.toString().equals("*\n*\n*\n"));
    }

    @Test
    public void shouldDrawtriangle() throws Exception
    {
       drawingExercise.drawTriangle(3);
        assertTrue(outContent.toString().equals("*\n**\n***\n"));
    }

    @Test
    public void shouldReturnOriginalNumberWhenNotAFizzBuzzNumber() {
        MatcherAssert.assertThat(drawingExercise.fizzBuzz(1), is("1"));
    }

    @Test
    public void shopuldReturnFizz()
    {
        MatcherAssert.assertThat(drawingExercise.fizzBuzz(3), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzz() throws Exception {

        MatcherAssert.assertThat(drawingExercise.fizzBuzz(5), is("Buzz"));
    }

    @Test
    public void shouldReturnFizzBuzz()
    {
        MatcherAssert.assertThat(drawingExercise.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void ShouldReturnPrimeNumbers() throws Exception
    {
        assertThat(drawingExercise.primeFactorExercise(30),is("235"));
    }
}