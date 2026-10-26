class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int op[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    op[i]=j-i;
                    break;
                }
            }
        }
        return op;
    }
}
