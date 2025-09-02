class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();

        for(String c : tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(c.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                int d = b-a;
                stack.push(d);
            } else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            } else if(c.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                int d = b/a;
                stack.push(d);
            } else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
