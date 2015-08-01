import java.util.HashMap;

/**
 * Created by zenglinxi on 15-8-1.
 */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int[] result = new int[2];

    for(int i = 0; i < nums.length; i++){
      int one = nums[i];
      int two = target - one;
      if(hm.containsKey(two) && hm.get(two) != i + 1){
        result[0] = hm.get(two);
        result[1] = i + 1;
      } else {
        hm.put(nums[i], i + 1);
      }
    }
    return result;
  }

  public static void main(String[] args){
    TwoSum ts = new TwoSum();
    int[] nums = {0, 4, 3, 0};
    int target = 0;
    int[] result = ts.twoSum(nums, target);
    for(int num : result){
      System.out.println(num);
    }
  }
}
