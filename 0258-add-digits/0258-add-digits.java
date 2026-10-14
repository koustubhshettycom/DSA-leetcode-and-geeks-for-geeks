class Solution {
    public int addDigits(int num) {
        //easy logic read the question
        while (num >= 10) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        num = sum;
    }

    return num;

    }
}//Time complexity is O(n)