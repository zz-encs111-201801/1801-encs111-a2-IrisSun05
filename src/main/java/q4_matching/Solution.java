package q4_matching;


import java.util.LinkedList;

public class Solution {

    /*
     * 假设 formula 一定不会是 null
     */

    public boolean isValid(String formula) {
        LinkedList<Character> stack = new LinkedList<>();
        if (formula.isEmpty()) {
            return true;
        }

        //if the first symbol is not open parenthesis return false
        if (formula.charAt(0) == '(' || formula.charAt(0) == '[' || formula.charAt(0) == '{') {
            for (int i = 0; i < formula.length(); i++) {
                if (formula.charAt(i) == '(' || formula.charAt(i) == '[' || formula.charAt(i) == '{') {
                    stack.addFirst(formula.charAt(i));//open parenthesis, push into stack

                } else if (formula.charAt(i) == ')') {
                    if(stack.isEmpty() == false) {
                        if(stack.getFirst() == '(') {
                            stack.removeFirst();
                        }
                    }else{return false;}
                } else if (formula.charAt(i) == ']') {
                    if(stack.isEmpty() == false) {
                        if (stack.getFirst() == '[') {
                            stack.removeFirst();
                        }
                    }else{return false;}
                }else if (formula.charAt(i) == '}') {
                    if(stack.isEmpty() == false) {
                        if (stack.getFirst() == '{') {
                            stack.removeFirst();
                        }
                    }else{return false;}
                }

            }
            if (stack.isEmpty()) {// to make sure there is no more open parenthesis left in stack
                return true;
            } else {
                return false;
            }
        }
        return false;

    }
}
