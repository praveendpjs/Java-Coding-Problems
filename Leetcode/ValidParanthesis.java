// https://leetcode.com/problems/valid-parentheses/description/
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

// Example 5:

// Input: s = "([)]"

// Output: false

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); //I am creating new stack called stack
         for(char i : s.toCharArray()) // char is used to store single char.The java string toCharArray() method converts the given string into a sequence of characters. The returned array length is equal to the length of the string. 
        if(i=='{' || i=='(' || i=='[' )
                stack.push(i);
        else{
            if(stack.empty() || (i==')' && stack.peek()!='(') || (i=='}' && stack.peek()!='{') || (i==']' && stack.peek()!='[') ) {
                return false; //peek() gives the latest value entered into stack

            }
                stack.pop();
            }
        return stack.empty(); //our stack should be empty if it is true
    }
    

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
    }
}
