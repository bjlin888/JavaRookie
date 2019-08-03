package entrylevel;

import java.util.Arrays;
import java.util.Random;

/*
    1. 基本型別認識與使用
    2. 基本變數宣告
    3. 基本陣列宣告與使用
    4. flow-control statement

    可以使用 System.out.println() 函式將變數內容輸出到終端機上，
    System.out 函式說明參考 https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#out
 */
public class Level1 {

  /*
   * 變數宣告與陣列使用
   */
  public int[] array() {
    int len = 10;
    // 宣告一陣列長度為 len，並將陣列利用 for 迴圈將陣列的元素分別給予由1到10的數字。
    // 以下寫程式碼
    Random random = new Random();
    // 將陣列內容輸出到終端機上
    // 將陣列中的每個元素，分別乘上一個隨機的正整數，
    // 隨機的數字可以使用 java.util.Random 類別。
    // 參考 https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt--
    // 以下寫程式碼
    int[] numbers = new int[len];

    for (int i=0; i < len; i++) {
      numbers[i] = (i+1) * random.nextInt(100);
    }

    System.out.println(Arrays.toString(numbers));

    // 傳回值改成前面宣告的陣列變數
    return numbers;
  }

  // 找出輸入的陣列中的最大正整數。
  // 傳回陣列中最大數前，將陣列內容輸出到終端機上
  public int max(int pNumbers[]) {
    if (pNumbers == null || pNumbers.length < 0) {
      return -1;
    }

    int max = pNumbers[0];
    for (int i=0; i < pNumbers.length; i++) {
      if (max < pNumbers[i]) {
        max = pNumbers[i];
      }
    }

    return max;
  }

  // 找出輸入的陣列中的最小正整數。
  // 傳回陣列中最小正整數前，將陣列內容輸出到終端機上
  public int min(int pNumbers[]) {
    if (pNumbers == null || pNumbers.length < 0) {
      return -1;
    }

    int min = pNumbers[0];
    for (int i=0; i < pNumbers.length; i++) {
      if (min > pNumbers[i]) {
        min = pNumbers[i];
      }
    }
    return min;
  }

}
