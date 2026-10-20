class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> t1 = new HashMap<>();
        int countS = 0;
        int countT = 0;
        for(int i=0;i<s.length();i++) {
            countS = s1.getOrDefault(s.charAt(i),0);
            s1.put(s.charAt(i), ++countS);
            countT = t1.getOrDefault(t.charAt(i),0);
            t1.put(t.charAt(i), ++countT);
        }
        if(s1.equals(t1))
            return true;
        return false;
    }
}
