import java.util.Stack;

class PathFinding {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for(String s : paths){
            if(s.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else if(!s.equals("")&&!s.equals(".")){
                stack.push(s);
            }
        }
        return "/"+String.join("/",stack); 
    }
}