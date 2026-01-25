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
