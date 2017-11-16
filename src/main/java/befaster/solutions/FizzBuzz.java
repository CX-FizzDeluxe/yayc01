package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	boolean by3 = isBy3(number);
    	boolean by5 = isBy5(number);
    	boolean isD = isDeluxe(number);
        if (by3 && by5 && isD) {
        	return "fizz buzz deluxe";
        } 
        if (by3 && by5) {
        	return "fizz buzz";
        } 
        if (by3 && isD) {
        	return "fizz deluxe";
        } 
        if (by5 && isD) {
        	return "buzz deluxe";
        } 
        if (by3) {
        	return "fizz";
        }
        if (by5) {
        	return "buzz";
        }
        if (isD) {
        	return "deluxe";
        }
		return number + "";
    }

    private static boolean isByNum(Integer num, Integer target) {
    	if (num % target == 0) {
    		return true;
    	}
    	while (num != 0) {
    		if (num % 10 == target) {
    			return true;
    		}
    		num /= 10;
    	}
    	return false;
    }

    private static boolean isDeluxe(Integer num) {
    	if (num < 10) return false;
    	int n = num % 10;
    	while (num != 0) {
    		if (num % 10 != n) return false;
    		num /= 10;
    	}
    	return true;
    }

    private static boolean isBy5(Integer num) {
    	return isByNum(num, 5);
    }

	private static boolean isBy3(Integer num) {
    	return isByNum(num, 3);
    }


}
