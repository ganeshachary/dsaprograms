package Stack;
import java.util.Stack;

public class InfixToPostFixExp {

    static int Precendence(char c){
       
        switch (c)
        {
            case '+':
            case '-':
                return 1;
        
            case '*':
            case '/':
                return 2;
        
            case '^':
                return 3;
        }
        
        return -1;

    }


    // The main method that converts given 
    // infix expression to postfix expression. 
    static String infixToPostfix(String exp){

        String result = new String("");
        Stack<Character> stack = new Stack();

        for(int i =0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }else if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                
                while(!stack.isEmpty()&&stack.peek() != '('){
                    result += stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() != '(')
                {
                    return "Invalid Expression"; // invalid expression       
                }else{
                    stack.pop();
                }
                    
            }else{
                
                while(!stack.isEmpty() && Precendence(ch)<=Precendence(stack.peek())){
                    result +=stack.pop();
                }

                stack.push(ch);

            }
        }

        // pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();
    
        return result;

    }

    public static int evaluatePostFix(String exp){

        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<exp.length();i++){
            int ch = exp.charAt(i);

            if(Character.isDigit(ch)){
            
                stack.push(ch-'0');
            }else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                switch(ch){
                    
                    case  '*' : stack.push(operand1 * operand2);
                                break;
                    case  '/' : stack.push(operand1 / operand2);
                                break;  
                    case  '+' :stack.push(operand1 + operand2);
                               break;
                    case  '-' :stack.push(operand1 - operand2);
                               break;
                    case  '^' :stack.push(operand1 ^ operand2);
                               break;

                }
                
            }
        }

        return stack.pop();
    }


    public static void main(String args[]){
        //String exp = "a+(b-c)*d";
        //System.out.println(infixToPostfix(exp));

        String exp = "((2+3)*2)/5";
        exp = infixToPostfix(exp);
        System.out.println(exp);
        System.out.println(evaluatePostFix(exp));


    }

    // test comment to git
    
}
