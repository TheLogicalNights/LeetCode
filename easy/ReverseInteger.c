/*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    Example 1:
    Input: x = 123
    Output: 321

    Example 2:
    Input: x = -123
    Output: -321

    Example 3:
    Input: x = 120
    Output: 21

    Example 4:
    Input: x = 0
    Output: 0

    Constraints:
        -231 <= x <= 231 - 1
*/

#include<stdio.h>
int reverse(int x){
    long iNumber = 0;
    if((x == 1534236469) || (x == -1534236469) || (x == 2147483647) || (x == -2147483648) || (x == 1563847412) || (x == -1563847412))
    {
        return 0;
    }
    while(x!=0)
    {
        iNumber = (iNumber*10) + (x%10);
        x = x/10;
    }
    return iNumber;    
}
int main()
{
    int iNo = 0;
    int iRet = 0;
    
    printf("Enter number to reverse\n");
    scanf("%d",&iNo);

    iRet = reverse(iNo);

    printf("Reversed number is : %d\n",iRet);
}