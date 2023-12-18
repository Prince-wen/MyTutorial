public class java_162_findPeakElement {

    public static void main(String[] args) {
        java_162_findPeakElement o = new java_162_findPeakElement();
        int[] nums = new int[]{1,2};
        System.out.println(o.findPeakElement(nums));

    }

    private int findPeakElement(int[] nums){
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]){
                i++;
            } else {
                return i;
            }
        }
        return i;
    }
}
