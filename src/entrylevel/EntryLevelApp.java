package entrylevel;


import java.util.Arrays;

public class EntryLevelApp {

  // EntryLevelApp 程式進入點
  public static void main(String pArgs[]) {
    EntryLevelApp entryLevelApp = new EntryLevelApp();
    entryLevelApp.runLevel1();
    entryLevelApp.runLevel2();
  }

  /*
    使用 Level1 所提供的 public 函式
    1. 產生一個正整數陣列
    2. 找出 1. 的陣列中的最大正整數，將此正整數輸出到終端機
    3. 找出 1. 的陣列中的最小正整數，將此正整數輸出到終端機

    NOTE: 使用 new 運算子產生一個 Level1 的實例(instance) 並使用所提供的 public 函式。
   */
  private void runLevel1() {
    Level1 leve1 = new Level1();

    int[] numbers = leve1.array();
    int max = leve1.max(numbers);
    System.out.println("Max number is " + max);

    int min = leve1.min(numbers);
    System.out.println("Min number is " + min);

  }

  private void runLevel2() {
    Level2 level2 = new Level2();
    int[] numbers = new int[]{2,3,4,5,6};
    int target = 99;
    int[] indexes = level2.level2_1(numbers, target);
    if (indexes != null) {
      System.out.println("Found target value " + target + " in " + Arrays.toString(numbers) + ", index of array is " + Arrays.toString(indexes));
    } else {
      System.out.println("Target value " + target + " not found in " + Arrays.toString(numbers));
    }

    int number = 897536;
    System.out.println(number + " reversed is " + level2.leve2_2(number));


    String string = "I am a java rookie";
    System.out.println("The [" + string + "] last word length is " + level2.leve2_4(string));

    int[] sortedArray = new int[] {5,9, 10, 35, 66};
    target = 35;
    int index = level2.leve2_5(sortedArray, target);
    System.out.println("Target " + target + " is in index of  " + Arrays.toString(sortedArray));

    target = 9;
    index = level2.leve2_5(sortedArray, target);
    System.out.println("Target " + target + " can be found or inserted index of  "
            + Arrays.toString(sortedArray) + ", index: " + index);

    target = 11;
    index = level2.leve2_5(sortedArray, target);
    System.out.println("Target " + target + " can be found or inserted index of  "
            + Arrays.toString(sortedArray) + ", index: " + index);

    target = 99;
    index = level2.leve2_5(sortedArray, target);
    System.out.println("Target " + target + " can be found or inserted index of  "
            + Arrays.toString(sortedArray) + ", index: " + index);
  }
}
