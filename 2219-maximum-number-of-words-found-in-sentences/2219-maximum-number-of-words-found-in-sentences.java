class Solution {
    public int mostWordsFound(String[] sentences) {
    int ans=0;
    for(int i=0;i<sentences.length;i++){
    String s= sentences[i] ;
    String[] splits=s.split(" ");
    int count=splits.length;
    ans=Math.max(count,ans);
    }  
    return ans;      
    }
}