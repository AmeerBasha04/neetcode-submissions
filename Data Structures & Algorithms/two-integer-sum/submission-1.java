class Solution {
    public int[] twoSum(int[] a, int t) {
        // int i=0,j=a.length-1;

        // while(i<j){
        //     int sum=a[i]+a[j];
        //     if(sum==t)
        //         return new int[]{i,j};
        //     else if(sum>t){
        //         j--;
        //     }else{
        //         i++;
        //     }
        // }

        // return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        map.put(a[0], 0);
        for (int i = 1; i < a.length; i++) {
            if (map.containsKey(t - a[i])) {
                return new int[] { map.get(t - a[i]), i };
            } else
                map.put(a[i], i);
        }

        return new int[] {};
    }
}
