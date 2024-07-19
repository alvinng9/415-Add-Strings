package org.example;

public class Solution {
    public String addStrings(String num1, String num2) {
        int one = num1.length() - 1;
        int two = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (one >= 0 || two >= 0) {
            int numOne = (one >= 0) ? num1.charAt(one) - '0' : 0;
            int numTwo = (two >= 0) ? num2.charAt(two) - '0' : 0;
            sb.append((numOne + numTwo + carry) % 10);
            carry = (numOne + numTwo + carry) / 10;
            one--;
            two--;
        }
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
