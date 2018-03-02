package com.test.components;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FizzBuzzCalculator {

    private final static String FIZZ = "Fizz";

    private final static String BUZZ = "Buzz";

    public List calculate(List nums){
        return (List) nums.stream().map(x -> ((Integer)x)%3 == 0 ? FIZZ : x).map(x -> x instanceof Integer && ((Integer)x)%5 == 0 ? BUZZ : x).collect(Collectors.toList());
    }
}
