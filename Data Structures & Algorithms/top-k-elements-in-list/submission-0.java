class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int numsLength = nums.length;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= numsLength; i++) {
            buckets.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            buckets.get(count).add(num);
        }

        int[] output = new int[k];
        int index = 0;

        for (int i = numsLength; i >= 0 && index < k; i--) {
            for (int num : buckets.get(i)) {
                output[index] = num;
                index++;

                if (index == k) {
                    break;
                }
            }
        }

        return output;
    }
}