package org.raisinz.arrays;

public class BalancedParenthesesUsingStack {


    private boolean isPair(char open,char close){
        if(open == '(' && close==')') return true;
        else if(open=='{' && close == '}') return true;
        else if(open == '[' && close == ']') return true;
        return false;
    }

    boolean checkParenthesesBalanced(String expression){

        Stack stack = new Stack(expression.length());
        char[] chars = expression.toCharArray();
        for (int i = 0; i < expression.length(); i++) {
            if(chars[i]=='(' || chars[i]== '{' || chars[i]== '['){
                stack.push(chars[i]);
            }
            else if(chars[i]==')' || chars[i]== '}' || chars[i]== ']'){
                if(stack.isEmpty() || !isPair(stack.peek(),chars[i])) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty()?true:false;
    }

    public static void main(String[] args) {

        BalancedParenthesesUsingStack balancedParenthesesUsingStack = new BalancedParenthesesUsingStack();
        boolean balanced = balancedParenthesesUsingStack.checkParenthesesBalanced("{()[]}");
        if(balanced) System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }
}


class Stack{
    private char[] stk;
    private int top;

    public Stack(int size){
        stk=new char[size];
        top=size;
    }

    void push(char v){
        if (top == 0) System.out.println("Overflow");
        else stk[--top]=v;
    }

    char pop(){
        if(top == stk.length){
            System.out.println("Underflow");
            return 0;
        }
        else return stk[++top -1];
    }

    boolean isEmpty(){
        if(top == stk.length) return true;
        else return false;
    }

    public char peek(){
        return stk[top];
    }
}