package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FunctionInLambdaTest {
//Линейное
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionInLambda function = new FunctionInLambda();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }
//квадратное
    @Test
    public void whenSquaredFunctionThenSquaredResults() {
        FunctionInLambda function = new FunctionInLambda();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }
//логорифмическое
    @Test
    public void whenLogFunctionThenLogResults() {
        FunctionInLambda function = new FunctionInLambda();
        List<Double> result = function.diapason(5, 8, Math::log);
        List<Double> expected = Arrays.asList(1.6094379124341003, 1.791759469228055, 1.9459101490553132);
        assertThat(result, is(expected));
    }
}