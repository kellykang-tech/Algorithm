package com.lab.studyplan.algorithm1.binarysearch;

public class BinarySearch704 {

    public int search(int[] nums, int target) {
        int standardPoint = nums.length / 2;

        if (nums[standardPoint] < target) {
            for (int i = standardPoint; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i <= standardPoint; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final BinarySearch704 bs = new BinarySearch704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
//        int target = 2;

        System.out.println(bs.search(nums, target));
    }
}
