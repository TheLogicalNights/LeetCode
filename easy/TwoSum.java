/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]

    Constraints:
        2 <= nums.length <= 103
        -109 <= nums[i

        ] <= 109
        -109 <= target <= 109
        Only one valid answer exists.
*/
import java.util.*;
class TwoSum 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int[] arr = new int[2];
        int i=0,j=0;
        
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(target==nums[i]+nums[j])
                {
                    break;
                }
            }
            if(j<nums.length)
            {
                break;
            }
        }
        if(i<nums.length-1)
        {
            arr[0] = i;
            arr[1] = j;
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("How many numbers do you want ?");
        int iNo = cin.nextInt();
        int iNums[] = new int[iNo];
        for(int i=0;i<iNums.length;i++)
        {
            iNums[i] = cin.nextInt();
        }
        System.out.println("Enter target : ");
        int iTarget = cin.nextInt();

        int[] iRet = TwoSum.twoSum(iNums,iTarget); 
        System.out.printf("[ ");
        for(int i=0;i<iRet.length;i++)
        {
            System.out.printf("%d ",iRet[i]);
        }
        System.out.printf(" ]");
        cin.close();
    }
}
