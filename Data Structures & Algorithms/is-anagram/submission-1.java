class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        //BF
        // Map<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        // }

        // for(int i=0;i<t.length();i++){
        //     if(map.containsKey(t.charAt(i)) ){
        //         if(map.get(t.charAt(i))>1)
        //             map.put(t.charAt(i),map.get(t.charAt(i))-1);
        //         else
        //             map.remove(t.charAt(i));
        //     }else
        //         return false;
        // }

        // return map.isEmpty();

        int[] a=new int[26];

        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }

        for(int i:a){
            if(i!=0)
                return false;
        }

        return true;

    }
}
