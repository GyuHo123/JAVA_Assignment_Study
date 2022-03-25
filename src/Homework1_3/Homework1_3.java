package Homework1_3;

public class Homework1_3 {
    public static void main(String[] args)
    {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            nums[i] = sum;
            System.out.println(nums[i]);
        }
    }
}
