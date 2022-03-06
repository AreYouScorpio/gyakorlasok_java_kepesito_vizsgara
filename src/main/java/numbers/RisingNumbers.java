package numbers;

import java.util.List;

public class RisingNumbers {


    public int getNumberOfSixDigitRisingNumbers(List<Integer> numbers) {

        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {

            String temp = numbers.get(i).toString();
            char[] tempChar = temp.toCharArray();
            int length = tempChar.length;
            if (length == 6) {
                boolean increasingNumber = true;
                for (int j = 0; j < tempChar.length - 1; j++) {
                    if (!(tempChar[j + 1] > tempChar[j])) {
                        increasingNumber = false;
                    }
                    if (increasingNumber) counter++;
                }

            }
        }
        return counter;
    }
}