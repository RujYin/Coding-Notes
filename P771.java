class Solution {
    public int numJewelsInStones(String J, String S) {
        int num=0;
        char[] S1=S.toCharArray();
        char[] J1=J.toCharArray();
        for(char s : S1){
            for(char j:J1){
                if(s==j){
                    num++;
                    break;
                }
                
            }
        }
        return num;
    }
}