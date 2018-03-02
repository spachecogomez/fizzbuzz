package com.test.rest;

import com.test.components.FizzBuzzCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sebastianpacheco on 1/03/18.
 */
@RestController
public class FizzBuzzController {

    @Autowired
    private FizzBuzzCalculator fizzBuzzCalculator;

    @RequestMapping(method = RequestMethod.POST, value = "/fizzbuzz", consumes = "application/json", produces = "application/json")
    public List calculateFizzBuzz(@RequestBody List<Integer> nums){
        return fizzBuzzCalculator.calculate(nums);
    }

}
