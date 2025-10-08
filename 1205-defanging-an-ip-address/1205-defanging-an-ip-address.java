class Solution {
    public String defangIPaddr(String address) {
       String ans="";
       int s=address.length();
       for(int i=0;i<s;i++){
        char ch=address.charAt(i);
            if(ch=='.'){
                ans=ans+"[.]";
            }else{
                ans=ans+ch;
            }
        }
        return ans;
        
    }
}