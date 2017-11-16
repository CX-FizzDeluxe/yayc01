package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import java.util.*;

public class FizzBuzz {
	
    public static String fizzBuzz(Integer number) {
    	String res = "";
    	boolean isNeither = true;
    	if (isFizz(number)) {
    		res += "fizz";
    		isNeither = false;
    	} 
    	if (isBuzz(number)) {
    		res += " buzz";
    		isNeither = false;
    	}
    	if (isDeluxeFizz(number) || isDeluxeBuzz(number)) {
    		if (number % 2 == 0) {
    			res += " deluxe";
    		} else {
				res += " fake deluxe";
    		}
    	}
    	if (isNeither)
			return number + "";
		if (res.startsWith(" ")){
			res = res.substring(1);
		}
		return res;
    }

    private static boolean isByNum(Integer num, Integer target) {
    	if (num % target == 0) {
    		return true;
    	}
    	return isDeluxe(num, target);
    }

    private static boolean isDeluxe(Integer num, int target) {
    	//contains target in num
    	int temp = num;
    	while (temp != 0) {	
    		if (temp % 10 == target) {
    			return true;
    		}
    		temp /= 10;
    	}
    	return false;
    }

    private static boolean isBuzz(Integer num) {
    	return isByNum(num, 5);
    }

	private static boolean isFizz(Integer num) {
    	return isByNum(num, 3);
    }

    private static boolean isDeluxeFizz(Integer num) {
    	if (!isFizz(num)) return false;
    	return isDeluxe(num, 3);
    }

    private static boolean isDeluxeBuzz(Integer num) {
    	if (!isBuzz(num)) return false;
    	return isDeluxe(num, 5);
    }
}
