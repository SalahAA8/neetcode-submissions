class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] isGrouped = new boolean[strs.length];
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i<strs.length; i++){
            if(isGrouped[i]){
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            char[] a1 = strs[i].toCharArray();
            for (int j=i+1; j<strs.length; j++){
                if (isGrouped[j]){
                    continue;
                }
                char[] a2 = strs[j].toCharArray();
                Arrays.sort(a1);
                Arrays.sort(a2);
                if(Arrays.equals(a1,a2)){
                    isGrouped[i] = true;
                    isGrouped[j] = true;
                    group.add(strs[j]);
                }
            }
            result.add(group);
        }

        return result;
    }
}
