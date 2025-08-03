class Solution 
{
    public int maximumNumberOfStringPairs(String[] words) 
    {
        int ans=0;
        int n=words.length;
        for(int i=0;i<n-1;i++)
        {
            String rev="";
            for(int j=words[i].length()-1;j>=0;j--)
            {
                rev+=words[i].charAt(j);
            }
            for(int k=i+1;k<n;k++)
            {
                if(rev.equals(words[k]))
                {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}