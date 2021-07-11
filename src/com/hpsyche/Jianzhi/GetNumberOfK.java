package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * k出现的次数
 */
public class GetNumberOfK {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0)
            return 0;
        int count = 0;
        int low = 0, high = array.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == k) {
                break;
            } else if (array[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low <= high) {
            for (int i = mid; i >= 0; i--) {
                if (array[i] == k) {
                    count++;
                } else {
                    break;
                }
            }
            for (int i = mid + 1; i < array.length; i++) {
                if (array[i] == k) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
