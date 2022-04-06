import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmstrongNumbers {

    private         List<Character> arrayOfNumbers = new ArrayList<>();


    public int howLongIsTheNumber(int number){
        return String.valueOf(number).length();
    }

    public void getCharArray(int number) {
        for (int i=1;i<howLongIsTheNumber(number)+1;i++){
            arrayOfNumbers.add(String.valueOf(number).charAt(i-1));
        }
    }

    public static void main(String[] args) {

        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();

        int input=153;
        armstrongNumbers.getCharArray(input);

        System.out.println(armstrongNumbers.arrayOfNumbers);
        System.out.println(armstrongNumbers.howLongIsTheNumber(input));
        int result=0;

        for (int i=1; i<armstrongNumbers.arrayOfNumbers.size()+1; i++){
            int newNumber = Character.getNumericValue(armstrongNumbers.arrayOfNumbers.get(i-1));
            result += Math.pow(newNumber,armstrongNumbers.howLongIsTheNumber(input));


        }
        System.out.println(result);

    }

}
