package search;

/**
 * Created by honoka on 16/2/21.
 * 二分查找
 */
public class BinarySearch {
    /**
     * 二分查找法，用于快速查找数组内的元素（但是数组必须是有序的）
     *
     * @param key 被查找的元素
     * @param a   被查找的数组
     * @return mid 被查找元素在数组中的位置, -1 元素在数组中不存在
     */
    public static int binarySearch(int key, int[] a) {
        int begin = 0;
        int end = a.length - 1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (key < a[mid]) {
                end = mid - 1;
            }
            if (key > a[mid]) {
                begin = mid + 1;
            }
            if (key == a[mid]) {
                while (mid - 1 >= 0 && key == a[mid - 1]) {
                    //特殊情况：如果数组中有重复元素，如[2,3,5,5,6,7,8]，搜索5时可能会匹配到第二个5就停止了，此处保证是第一个出现该元素的位置
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }

}
