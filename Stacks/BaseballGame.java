import java.util.Stack;

public class BaseballGame {
    public int BaseballGameUsingOperators(String[] operations){
        Stack<Integer> stack = new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int top=stack.pop();
                int newTop=top+stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if(op.equals("D")){
                stack.push(stack.peek());
            }else if(op.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int i: stack){
            sum+=i;
        }
        return sum;
    }
}
// “I solved this problem using a stack.
// I iterate over each operation:

// If it's a number, I convert it and push it to the stack.

// If it's ‘+’, I calculate the sum of the last two scores and push it.

// If it's ‘D’, I push double the previous score.

// If it's ‘C’, I remove the last score.   
  
// After processing all operations, I sum up all the values in the stack and return the final score.
// Using a stack makes it easy to access and manipulate the recent scores.”