package org.example;

public class Solution {
    public String addStrings(String num1, String num2) {
        //find the lengths of given Strings
        int one = num1.length() - 1;
        int two = num2.length() - 1;
        //keep track of the leftover of the sum
        int carry = 0;
        //initialize a string builder for the result
        StringBuilder sb = new StringBuilder();
        //go through both strings
        while(one >= 0 || two >= 0) {
            //check if the first index of each string has been reached to make
            //sure the index does not go out of bounds
            int numOne = (one >= 0) ? num1.charAt(one) - '0' : 0;
            int numTwo = (two >= 0) ? num2.charAt(two) - '0' : 0;
            //append the sum to the string builder
            sb.append((numOne + numTwo + carry) % 10);
            //calculate the leftover
            carry = (numOne + numTwo + carry) / 10;
            //move an index to the left
            one--;
            two--;
        }
        //check if the leftover is 0 or not
        if (carry != 0) {
            sb.append(1);
        }
        //return the string builder
        return sb.reverse().toString();
    }
}
