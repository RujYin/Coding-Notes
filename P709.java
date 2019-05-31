class Solution {
    public String toLowerCase(String str) {
        char[] q=new char[str.length()];
        char[] str1=new char[str.length()];
        str1=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(((int)(str1[i])<=(int)('Z'))&&((int)(str1[i])>=(int)('A'))){
                q[i]=(char)((int)(str1[i])-(int)('A')+(int)('a'));
            }
            else{
                q[i]=str1[i];
            }
        }
        String q1 =String.copyValueOf(q);
        
        return q1;
        
    }
}