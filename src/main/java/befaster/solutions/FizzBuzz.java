package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import java.util.*;

public class FizzBuzz {
	
    public static String fizzBuzz(Integer number) {
    	int by3 = isBy3(number);
    	int by5 = isBy5(number);
    	int isD = isDeluxe(number);
    	int sum = by3 + by5 + isD;
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "fizz");
        map.put(5, "buzz");
        map.put(7, "deluxe");
        map.put(11, "fake deluxe");
        map.put(8, "fizz buzz");
        map.put(10, "fizz deluxe");
        map.put(14, "fizz fake deluxe");
        map.put(12, "buzz deluxe");
        map.put(16, "buzz fake deluxe");
        map.put(15, "fizz buzz deluxe");
        map.put(19, "fizz buzz fake deluxe");
        if (map.containsKey(sum)) {
        	return map.get(sum);
        }

		return number + "";
    }

    private static int isByNum(Integer num, Integer target) {
    	if (num % target == 0) {
    		return target;
    	}
    	while (num != 0) {
    		if (num % 10 == target) {
    			return target;
    		}
    		num /= 10;
    	}
    	return 0;
    }

    private static int isDeluxe(Integer num) {
    	boolean isEven = (num % 2 == 0);
    	if (num < 10) return 0;
    	int n = num % 10;
    	while (num != 0) {
    		if (num % 10 != n) return 0;
    		num /= 10;
    	}
    	return isEven ? 7 : 11;
    }

    private static int isBy5(Integer num) {
    	return isByNum(num, 5);
    }

	private static int isBy3(Integer num) {
    	return isByNum(num, 3);
    }


}
