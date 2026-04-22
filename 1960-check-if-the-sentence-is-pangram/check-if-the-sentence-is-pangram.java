class Solution {
    public boolean checkIfPangram(String sentence) {
        String al = "qwertyuiopasdfghjklzxcvbnm";
        for(int i = 0 ; i < sentence.length() ; i++)
        {
            char ch = sentence.charAt(i);
            if(al.contains(ch+""))
            {
                al = al.replace(ch+"","");
            }
        }
        return al.length() == 0;
    }
}