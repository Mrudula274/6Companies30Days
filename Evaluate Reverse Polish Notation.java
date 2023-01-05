class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String t : tokens){
            if("+-/*".contains(t)){
                s.push(ev(s.pop(),s.pop(),t));
            }
            else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }
    public int ev(int b,int a,String op){
        if("+".equals(op)){
            return a+b;
        }
        else if("-".equals(op)){
            return a-b;
        }
        else if("*".equals(op)){
            return a*b;
        }
        else{
            return a/b;
        }
    }
}