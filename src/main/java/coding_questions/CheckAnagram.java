package coding_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagram {
    public static void main(String[] args) {
        /*
        An anagram in Java refers to a pair of words or phrases that are created by rearranging
        the letters of each other. In other words, two strings are considered anagrams if they
        have the same characters with the same frequency, but the order of the characters is
        different.

        STEPS:
        1. Convert String into Stream of values
        2. Convert into lower or upper case
        3. sort the data
        4. Collect and join the data
        */


        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println("Arranged S1  :: "+s1);
        System.out.println("Arranged S2  :: "+s2);

        System.out.println("");

        if (s1.equals(s2))
            System.out.println("Two Strings are anagrams");
        else
            System.out.println("Two Strings are not anagrams");

    }
}
