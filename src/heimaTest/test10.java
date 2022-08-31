package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test10 {
    public static void main(String[] args) {
        //定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创
        //建其他数组，不必须在原数组中改变）
        int[] arr = {10,50,80,54,65,52,85};
        int[] arrNew = new int[arr.length];//定义新数组的长度
        //定义代表奇数要存放的位置
        int left = 0;
        //定义代表偶数要存放的位置
        int right = arr.length - 1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2==0){//判断元素是否是偶数
                arrNew[right] = arr[i];
                right--;
            }else {
                arrNew[left] = arr[i];
                left++;
            }
        }
        //遍历输出数组
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + "\t");
        }
    }
}
