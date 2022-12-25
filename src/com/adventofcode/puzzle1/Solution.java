package com.adventofcode.puzzle1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("puzzle1_input.txt"));

        String input = bufferedReader.lines().collect(Collectors.joining("\n"));

        String[] blocks = input.split("\n");

        int caloriesSum = 0;

        ArrayList<Elve> elves = new ArrayList<>();

        for (String s : blocks){
            if(s.equals("")){
                elves.add(new Elve(caloriesSum));
                caloriesSum = 0;
                continue;
            }
            caloriesSum += Integer.parseInt(s);
        }

        elves.stream().forEach(elve -> System.out.println(elve.getCalories()));

        int sum = 0;

        IntStream intValue = elves.stream().sorted(Comparator.comparingInt(Elve::getCalories).reversed()).limit(3).map(Elve::getCalories).mapToInt(Integer::intValue);

        sum = intValue.sum();

        System.out.println(sum);

    }
}
