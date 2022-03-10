package numbers;

import java.util.List;

public class RisingNumbers {


    public static int getNumberOfSixDigitRisingNumbers(List<Integer> numbers) {
        if (numbers==null || numbers.isEmpty()) throw new IllegalArgumentException("There are no numbers!");
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            String temp = numbers.get(i).toString();
            if ((temp.length() == 6) && isIncreasingNumber(temp))  {
                counter++;}
            }
        return counter;
    }

    public static boolean isIncreasingNumber(String temp){
        char[] tempChar = temp.toCharArray();
        int len = tempChar.length;
        for (int j = 0; j < len - 1; j++) {
            if ((tempChar[j + 1] <= tempChar[j])) {
                return false;
            }
        }
        return true;
    }

}

