class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        String ops="+-*/";
        for(String t:tokens){
            if(ops.indexOf(t)!=-1){
                int d2=s.pop();
                int d1=s.pop();
                int res=0;
                if(t.equals("+")){
                    res=d1+d2;
                } else if(t.equals("-")){
                    res=d1-d2;
                } else if(t.equals("*")){
                    res=d1*d2;
                }else if(t.equals("/")){
                    res=d1/d2;
                } 
                s.push(res); 
            } 
           
            else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.peek();
    }
}
