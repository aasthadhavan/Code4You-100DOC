class Solution {
    public int calculate(String s) {
      if(s==null || s.length()==0) return 0;
        Stack<Integer> st=new Stack<>();
        int cur=0;
        char op='+';
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
cur=cur*10+c[i]-'0';
            }
           if((!Character.isDigit(c[i]) && c[i]!=' ') || i==s.length()-1){
                if(op=='+'){
                    st.push(cur);
                }
                else if(op=='-'){
                      st.push(-cur);
                }
                 else if(op=='*'){
                      st.push(st.pop()*cur);
                }
                 else if(op=='/'){
                    st.push(st.pop()/cur);
                }
                op=c[i];
                cur=0;
            }
        }
        int sum=0;
        while(!st.empty()){
            sum+=st.pop();
        }
        return sum;
    }
}
