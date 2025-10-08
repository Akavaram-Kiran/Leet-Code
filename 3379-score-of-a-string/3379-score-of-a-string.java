class Solution {
    public int scoreOfString(String s) {
         int sum=0;
        for (int i=0;i<s.length()-1;i++){
            int a=i;
            int b=i+1;
            char first=s.charAt(i);
            char second=s.charAt(b);
            int aascii=first;
            int bascii=second;
            int temp=Math.abs(first-second);
            sum= sum+temp;
        }
        return sum;
    }   
}