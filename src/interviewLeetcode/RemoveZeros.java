package interviewLeetcode;

public class RemoveZeros {
    public static void main(String[] args) {
        int[] data = new int[]{0,1,21,0,12};
        moveZeroes(data);
        for (int datum : data) {
            System.out.println(datum);
        }
    }
    public static void moveZeroes(int[] nums) {
        //1.iterate the nums get the locations nums of zero
        //2.所有位置挨个进行
        //tow points i and j
        int i =0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }

        }

    }


}
