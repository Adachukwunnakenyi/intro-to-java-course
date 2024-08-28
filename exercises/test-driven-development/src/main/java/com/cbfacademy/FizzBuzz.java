package com.cbfacademy;

public class FizzBuzz {

  public static String get(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return "FizzBuzz";
  }

  else if(n % 3 == 0){
       return "Fizz";
  }

  else if(n % 5 == 0){
        return "Buzz";
     
  }

  else {
    // String.valueOf() method converts the integer num to its string representation.
    //For example, if num is 4, String.valueOf(num) will return "4" as a string.
    return String.valueOf(n);
  }
  }
}
