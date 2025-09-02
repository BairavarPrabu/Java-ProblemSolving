class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(String op: operations){
            if(op.equals("+")){
                int top = stack.pop();
                int newtop = stack.peek();
                int newtop1 = top + newtop;
                stack.push(top);
                stack.push(newtop1);
                res += newtop1;
            } else if(op.equals("D")){
                stack.push(2*stack.peek());
                res += stack.peek();
            }else if(op.equals("C")){
                res -= stack.pop();
            } else{
                stack.push(Integer.parseInt(op));
                res += stack.peek();
            }
        }
        return res;
    }
}