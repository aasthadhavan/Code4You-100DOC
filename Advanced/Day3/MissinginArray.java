class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int i:arr){
            sum-=i;
        }
        return sum;
    }
}