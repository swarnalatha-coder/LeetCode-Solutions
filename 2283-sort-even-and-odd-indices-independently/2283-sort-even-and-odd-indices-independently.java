class Solution {
  public int[] sortEvenOdd(int[] nums) {
    ArrayList<Integer> nm = new ArrayList<>();
    int k = nums.length;
    for (int i = 0; i < k; i += 2) {
      nm.add(nums[i]);
    }
    Collections.sort(nm);
    int j = 0;
    for (int i = 0; i < k; i += 2) {
      nums[i] = nm.get(j++);
    }
    nm.clear();
    for (int i = 1; i < k; i += 2) {
      nm.add(nums[i]);
    }
    Collections.sort(nm, Collections.reverseOrder());
    j = 0;
    for (int i = 1; i < k; i += 2) {
      nums[i] = nm.get(j++);
    }
    return nums;
  }
}