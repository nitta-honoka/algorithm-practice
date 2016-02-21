import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import search.BinarySearch;

import java.util.Arrays;

/**
 * Created by honoka on 16/2/21.
 * 二分查找法测试，场景：白名单过滤
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            //读取键值，打印白名单中不存在的元素
            int key = StdIn.readInt();
            if (BinarySearch.binarySearch(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }
}