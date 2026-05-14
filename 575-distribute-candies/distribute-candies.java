class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for(int n : candyType)
        {
            s.add(n);
        }
        return (s.size() >= candyType.length / 2) ? candyType.length / 2 : s.size();
    }
}