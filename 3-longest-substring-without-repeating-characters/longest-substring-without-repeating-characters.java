class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (temp.contains(c + "")) {
                int index = temp.indexOf(c);
                temp = temp.substring(index + 1);
            }

            temp += c;
            max = Math.max(max, temp.length());
        }

        return max;
    }
}
