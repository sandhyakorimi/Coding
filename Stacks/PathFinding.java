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
// I split the path by /, use a stack to store directories, ignore . and empty parts, pop the stack for .., 
// and finally join the stack with / to get the simplified path.