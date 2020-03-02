import java.util.*;
public class MaxInteger {
    public int FindMaxNumber(Integer inputOne, Integer inputTwo, Integer inputThree) {

        if(inputOne.compareTo(inputTwo)>0 && inputOne.compareTo(inputThree)>0)
        {
            return inputOne;
        }
        else if (inputTwo.compareTo(inputOne)>0 && inputTwo.compareTo(inputThree)>0)
        {
            return inputTwo;
        }
        else
            {
            return inputThree;
        }
    }
}
