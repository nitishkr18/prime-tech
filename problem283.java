public class problem283 {
   public static void main(String[]args){

    int[]nums = {0,1,0,3,12};
    problem283 obj = new problem283();
    obj.moveZeroes(nums);
    for(int x:nums){
        System.out.print(x+" ");
    }
}

    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                swap(nums, i, j);
                i++;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}