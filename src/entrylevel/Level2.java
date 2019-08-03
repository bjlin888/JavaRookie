package entrylevel;

public class Level2 {

   public int[] level2_1(int[] numbers, int target) {
      int indexes[] = null;
      if (numbers == null || numbers.length == 0
              || target < 0) {
         return null;
      }

      int x = 0;
      int y = 0;
      for (int i=0; i < numbers.length; i++) {
         x = numbers[i];
         y = target - x;
         for(int j=i+1; j < numbers.length; j++) {
            if (y == numbers[j]) {
               indexes = new int[]{i, j};
               break;
            }
         }

         if (indexes != null) {
            break;
         }
      }
      return indexes;
   }

   public int leve2_2(int input) {
      if(input < 0) {
         return 0;
      }
      String str = String.valueOf(input);
      int len = str.length();
      char[] nums = str.toCharArray();
      int num = 0;
      for (int i=nums.length - 1; i >= 0; i--) {
         num += Math.multiplyExact((int)Math.pow(10, i), Character.digit(nums[i], 10));
      }
      int reversedNum = num;

      return reversedNum;
   }

   public int leve2_4(String string) {
      if (string == null || string.length() <= 0) {
         return 0;
      }

      String strs[] = string.split(" ");
      int lastWordLen = 0;
      String lastWord = strs[strs.length -1];
      lastWordLen = lastWord.length();
      return lastWordLen;
   }

   public int leve2_5(int[] sortedArray, int target) {
      int index = -1;
      if (sortedArray == null || sortedArray.length <= 0) {
         return index;
      }

      boolean found = false;
      for (int i = 0; i < sortedArray.length; i++) {
         int element = sortedArray[i];
         if (target == sortedArray[i]) {
            found = true;
            index = i;
            break;
         }
      }

      if (found) {
         return index;
      }

      if (target > sortedArray[sortedArray.length - 1]) {
         index = sortedArray.length;
         return index;
      }

      for (int i = 0; i < sortedArray.length; i++) {
         int element = sortedArray[i];
         if (target < element) {
            index = i;
            break;
         } else {
            continue;
         }
      }
      return index;
   }
}
